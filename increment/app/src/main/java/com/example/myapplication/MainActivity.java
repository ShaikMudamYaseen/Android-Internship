package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);

    }

    public void Toast(View view) {
        Toast.makeText(this, "Hill Welcome android"+i, Toast.LENGTH_SHORT).show();
    }

    public void incre(View view) {
        i++;
        tv.setText(""+i);
    }

    public void decre(View view) {
        i--;
        tv.setText(""+i);
    }
}
