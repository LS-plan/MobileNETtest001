package com.example.mobilenettest001;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Wifi已连接",Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    public void welcome(View view) {
        TextView tv=findViewById(R.id.textview);
        tv.setText("UPC欢迎你！");
        Toast.makeText(this,"Wifi已断开",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListViewSsyActivity.class);
        startActivity(intent);
    }
}