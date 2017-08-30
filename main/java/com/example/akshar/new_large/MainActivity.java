package com.example.akshar.new_large;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    MyAdpt myAdpt;
    ArrayList<HashMap<String, String>> arrayList;

    MyBean myBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.mylist);
        arrayList=new ArrayList<>();
        loaddata();
    }

    public void loaddata(){
        AsynkLoader helper=new AsynkLoader(MainActivity.this,"https://api.androidhive.info/contacts" , new OnAsynkLoader() {
            @Override
            public void Onresult(String result) {

                try {
                    JSONObject jsonObject = new JSONObject(result);
                    JSONArray jsonArray = jsonObject.getJSONArray("contacts");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject job = jsonArray.getJSONObject(i);

                        HashMap<String, String> hashMap = new HashMap<>();

                        hashMap.put("Id",job.getString("id"));
                        hashMap.put("Name",job.getString("name"));


                        JSONObject phone = job.getJSONObject("phone");
                        hashMap.put("Mobile",phone.getString("mobile"));
                        hashMap.put("Home",phone.getString("home"));


                        arrayList.add(hashMap);
                }
                    Log.d("array", "Onresult: "+arrayList.toString());
                    String[] list = {"Id", "Name", "Mobile","Home"};
                    int[] setData = {R.id.id121, R.id.name, R.id.mobile,R.id.home11};
                    SimpleAdapter simpleAdapter = new SimpleAdapter(MainActivity.this, arrayList, R.layout.my_layout, list, setData);
                    listView.setAdapter(simpleAdapter);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        helper.execute();
    }

}
