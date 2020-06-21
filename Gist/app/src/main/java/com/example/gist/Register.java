package com.example.gist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    EditText email4,password4;
    private FirebaseAuth Auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email4=findViewById(R.id.emailr);
        password4=findViewById(R.id.passr);
        Auth=FirebaseAuth.getInstance();
    }

    public void signupr(View view) {
        String email=email4.getText().toString().trim();
        String password=password4.getText().toString().trim();
        if(email.isEmpty()||password.isEmpty())
        {
            Toast.makeText(this, "fill the details", Toast.LENGTH_SHORT).show();
        }
        Auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(Register.this,MainActivity.class));
                    Toast.makeText(Register.this, "successfully Register", Toast.LENGTH_SHORT).show();
                    finish();

                }
                else {
                    Toast.makeText(Register.this, "Register not Successfull", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void loginr(View view) {
    }
}