package com.example.hospitalmanagementssystemca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.EditText;

public class P2AsyncTask extends AppCompatActivity {
    EditText editText;
    int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2_async_task);

        editText = (EditText) findViewById(R.id.seconds);
        time = Integer.parseInt(editText.getText().toString());

        new Mytask().execute();
    }

    private class Mytask extends AsyncTask<Void,Integer,String> {
        int count;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            count = time * 60;
        }

        @Override
        protected String doInBackground(Void... voids) {
            for (int i = 1; i <= count; i++) {
                try {
                    Thread.sleep(1000);

                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Done";
        }
    }
}