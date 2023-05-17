package com.example.mobilenettest001;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AddAndDecreaseButton extends LinearLayout {
    private int amount = 0;     //数量

    boolean isChanged = false;

    private final TextView etAmount;
    private final ImageView btnDecrease;
    private final ImageView btnIncrease;

    public AddAndDecreaseButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.activity_add_and_decrease, this);

        etAmount = findViewById(R.id.etAmount);
        btnDecrease = findViewById(R.id.btnDecrease);
        btnIncrease = findViewById(R.id.btnIncrease);

        //设置-号按键点击事件
        btnDecrease.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (amount > 0) {
                    amount--;
                }
                else{
                    Toast.makeText(getContext(), "已是最小数量", Toast.LENGTH_SHORT).show();
                }
                etAmount.setText(String.valueOf(amount));

//                if (v == btnDecrease) {
//                    if (isChanged) {
//                        btnDecrease.setImageDrawable(getResources().getDrawable(R.drawable.icon_minus_enable));
//                    }
//                    else{
//                        btnDecrease.setImageDrawable(getResources().getDrawable(R.drawable.icon_minus_enable_pressed));
//                    }
//                    isChanged = !isChanged;
//                }
            }
        });

        //设置+号按键点击事件
        btnIncrease.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (amount <= 60) {
                    amount++;
                }
                else{
                    Toast.makeText(getContext(), "此时已经超过60", Toast.LENGTH_SHORT).show();
                }
                etAmount.setText(String.valueOf(amount));

//                if (v == btnIncrease) {
//                    if (isChanged) {
//                        btnIncrease.setImageDrawable(getResources().getDrawable(R.drawable.icon_add_enable));
//                    }
//                    else{
//                        btnIncrease.setImageDrawable(getResources().getDrawable(R.drawable.icon_add_enable_pressed));
//                    }
//                    isChanged = !isChanged;
//                }
            }
        });
    }
}
