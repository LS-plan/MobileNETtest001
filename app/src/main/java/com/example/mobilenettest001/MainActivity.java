package com.example.mobilenettest001;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Toast.makeText(this, "恭喜你登陆成功", Toast.LENGTH_SHORT).show();
    }

    public void register(View view) {

    }

    @SuppressLint("SetTextI18n")
    public void Do(View view) {
        TextView tv=findViewById(R.id.zqm_textview);
        tv.setText("上穷碧落下黄泉！");

    }
}