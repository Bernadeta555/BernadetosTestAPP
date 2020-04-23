package com.example.bernadetostestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbuttonMainClick(View view) {
        TextView textViewMain = findViewById(R.id.textviewMain);
        textViewMain.setText(R.string.new_text);
        textViewMain.setTextColor(Color.RED);
    }
}
