package com.example.mobilenettest001;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity_zqm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        //获取按钮
        Button button = findViewById(R.id.button);

//按钮进行监听
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个（MainActivity.this）是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(com.example.mobilenettest001.MainActivity_zqm.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        ArrayList lists = new ArrayList< >();
        String[] theme = {"张巧妹1号", "张巧妹2号", "张巧妹3号", "张巧妹4号"};
        int[] imageViews = {R.drawable.sleep,R.drawable.sleep,R.drawable.sleep,R.drawable.sleep,};
        String[] content = {"今天", "天气", "真好", "哈哈"};
        SimpleAdapter adapter;
        for(int i=0;i < theme.length;i++){
            Map<String,Object> map =new HashMap< >();
            map.put("image",imageViews[i]);
            map.put("theme",theme[i]);
            map.put("content",content[i]);
            lists.add(map);
            adapter = new SimpleAdapter(MainActivity_zqm.this,lists,R.layout.list_item
                    ,new String[]{"image" ,"theme","content"}
                    ,new int[]{R.id.imageView,R.id.textView,R.id.textView2});
            ListView listView=findViewById(R.id.listView) ;
            listView.setAdapter(adapter);
        }

    }

    @SuppressLint("SetTextI18n")
    public void Do(View view) {
        TextView tv=findViewById(R.id.zqm_textview);
        tv.setText("上穷碧落下黄泉！");
        Toast.makeText(this,"你是文盲",Toast.LENGTH_SHORT).show();

    }

}
