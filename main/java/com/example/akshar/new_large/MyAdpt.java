package com.example.akshar.new_large;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Akshar on 8/30/2017.
 */

public class MyAdpt extends BaseAdapter {
    ArrayList<MyBean>arrayList;
    Context context ;
    MyBean myBean;


    public MyAdpt(Context context, ArrayList<MyBean> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.my_layout,null);
        TextView txtID,txtName,txtMobile,txtHome;
        ImageView imgView;

       /* txtID=(TextView) convertView.findViewById(R.id.id121);
        txtName=(TextView) convertView.findViewById(R.id.name);
        txtMobile=(TextView) convertView.findViewById(R.id.mobile);
        txtHome=(TextView) convertView.findViewById(R.id.home11);

        myBean=arrayList.get(position);

        txtID.setText(myBean.getId());
        txtName.setText(myBean.getName());
        txtMobile.setText(myBean.getMobile());
        txtHome.setText(myBean.getHome());*/
        return convertView;
    }
}
