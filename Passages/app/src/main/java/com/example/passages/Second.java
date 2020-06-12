package com.example.passages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.tv);
        String n=getIntent().getStringExtra("key");
        textView.setText(" "+n);

    }
}