package com.example.mobilenettest001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginSsyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ssy);
        Toast.makeText(this,"李振准备登录...",Toast.LENGTH_SHORT).show();
    }

}