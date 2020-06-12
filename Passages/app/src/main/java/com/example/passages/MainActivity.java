package com.example.passages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void pass1(View view) {

        Intent i1=new Intent(this,Second.class);
        i1.putExtra("key",this.getString(R.string.pass1));
        startActivity(i1);
    }

    public void pass2(View view) {

        Intent i2=new Intent(this,Second.class);
        i2.putExtra("key",this.getString(R.string.pass2));
        startActivity(i2);
    }


    public void pass3(View view) {

        Intent i3=new Intent(this,Second.class);
        i3.putExtra("key",this.getString(R.string.pass3));
        startActivity(i3);
    }
}