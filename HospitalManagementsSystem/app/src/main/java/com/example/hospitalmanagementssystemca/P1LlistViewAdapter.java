package com.example.hospitalmanagementssystemca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class P1LlistViewAdapter extends BaseAdapter {

    Context context;
    String[] names;
    int[] pics;


    public P1LlistViewAdapter(Context context,int[] pics,String[] names){
        this.context = context;
        this.pics = pics;
        this.names = names;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.p1listlayout, null);
        TextView textView = (TextView) v.findViewById(R.id.textPatientNameView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imagePatientView);

        textView.setText(names[i]);
        imageView.setImageResource(pics[i]);


        return v;
    }
}
