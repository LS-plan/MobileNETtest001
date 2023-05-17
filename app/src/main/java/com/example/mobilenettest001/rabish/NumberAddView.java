package com.example.mobilenettest001.rabish;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class NumberAddView extends View implements View.OnClickListener {
    public int number;

    public NumberAddView(Context context, AttributeSet attrs) {
        super(context, attrs);
        number = 0;
    }

    @Override
    public void onClick(View v) {
        number++;
        invalidate();
    }
}
