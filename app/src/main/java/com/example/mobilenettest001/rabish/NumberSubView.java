package com.example.mobilenettest001.rabish;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class NumberSubView extends View implements View.OnClickListener {
    public int number;

    public NumberSubView(Context context, AttributeSet attrs) {
        super(context, attrs);
        number = 0;
    }

    @Override
    public void onClick(View v) {
        number--;
        invalidate();
    }
}
