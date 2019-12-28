package com.michelle.windowsswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondWindows extends AppCompatActivity {

    private ImageView chimmy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_windows);
        chimmy = findViewById(R.id.bt21);
    }
    public void chimmy(View view){
        chimmy.setAlpha(1.0f);
        chimmy.setVisibility(View.VISIBLE);
        chimmy.animate().alpha(0.0f).setDuration(2500);
    }
}
