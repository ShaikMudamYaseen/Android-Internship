package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.number);

    }

    public void dail(View view) {
        String n=editText.getText().toString();
        Uri uri=Uri.parse("tel:"+n);
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);




    }
}