package com.example.gist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Signout extends AppCompatActivity {
    FirebaseAuth Auth;
    ProgressDialog progressDialog;
    private  static int splash=500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signout);
        Auth=FirebaseAuth.getInstance();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    public void signout(View view) {
        progressDialog=new ProgressDialog(Signout.this);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_bar);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        Auth.signOut();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Signout.this,MainActivity.class));

            }
        },splash);
        Toast.makeText(this, "Signout Successful", Toast.LENGTH_SHORT).show();
        finish();
    }


}