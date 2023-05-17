package com.example.mobilenettest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginSsyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ssy);
        Toast.makeText(this,"李振准备登录...",Toast.LENGTH_SHORT).show();
    }

    public void login(View view) {
        Intent intent = new Intent(this, LoginViewMainSsyActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent(this, RegisterViewMainSsyActivity.class);
        startActivity(intent);
    }
}