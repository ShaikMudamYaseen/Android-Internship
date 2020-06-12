package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        number=findViewById(R.id.number);

    }

    public void submit(View view) {
        String n=name.getText().toString();
        String e=email.getText().toString();
        String u=number.getText().toString();

        Toast.makeText(this, "name"+n+"email"+e+"number"+u , Toast.LENGTH_SHORT).show();
    }

}
