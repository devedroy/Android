package com.example.hospitalmanagementssystemca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] names = {"Roy","Dev","Preyo","Lucifer","Klaus"};
    int[] pics = {R.drawable.patient,R.drawable.patient,R.drawable.patient,R.drawable.patient,R.drawable.patient};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listUser);
        P1LlistViewAdapter adapter = new P1LlistViewAdapter(MainActivity.this,pics,names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),P2AsyncTask.class);
                setContentView(R.layout.activity_p2_async_task);
                startActivity(intent);

            }
        });
    }
}