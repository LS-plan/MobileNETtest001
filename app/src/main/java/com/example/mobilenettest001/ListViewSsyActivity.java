package com.example.mobilenettest001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListViewSsyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_main_ssy);
        Toast.makeText(this,"Wifi2已连接,当前为第二个页面listview",Toast.LENGTH_SHORT).show();

        ArrayList lists = new ArrayList<>();
        int[] imageViews = {R.drawable.pic1,R.drawable.pic1};
        String[] theme = {"Nobody.","Tutu",};
        String[] content = {"Nobody.","Tutu",};
        SimpleAdapter adapter;

        for (int i = 0; i < theme.length; i ++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image",imageViews[i]);
            map.put("theme",theme[i]);
            map.put("content",content[i]);
            lists.add(map);
        }
        adapter = new SimpleAdapter(ListViewSsyActivity.this,lists,R.layout.list_item_ssy,
                new String[]{"image","theme","content"},new int[]{R.id.imageViewl,R.id.textViewl,R.id.textViewl2});
        ListView lv = findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }
}