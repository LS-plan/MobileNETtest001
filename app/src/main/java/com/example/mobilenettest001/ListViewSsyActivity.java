package com.example.mobilenettest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        adapter = new SimpleAdapter(ListViewSsyActivity.this,lists,R.layout.list_view_item_ssy,
                new String[]{"image","theme","content"},new int[]{R.id.imageViewl,R.id.textViewl,R.id.textViewl2});
        ListView lv = findViewById(R.id.listView);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((parent, view, position, id) -> {
            // 通过getAdapter()方法取得MyAdapter对象，再调用getItem(int)返回一个Data对象
            Data t = (Data) lv.getAdapter().getItem(position);

            // 将点击的item里面的字弹出来
            Toast.makeText(ListViewSsyActivity.this, "t.getMap().hashCode()", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(ListViewSsyActivity.this, MainActivity.class);
//            startActivity(intent);
        });
    }
}