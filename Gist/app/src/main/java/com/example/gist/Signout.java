package com.example.gist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.signout:
                AlertDialog.Builder alert = new AlertDialog.Builder(Signout.this);
                alert.setMessage("Do you want to Sign Out").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                progressDialog=new ProgressDialog(Signout.this);
                                progressDialog.show();
                                progressDialog.setContentView(R.layout.progress_bar);
                                progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                Auth.signOut();
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        progressDialog.dismiss();
                                        startActivity(new Intent(Signout.this,MainActivity.class));
                                        finish();

                                    }
                                },splash);
                                Toast.makeText(Signout.this, "Signout Successful", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                alert.show();

        }
        return super.onOptionsItemSelected(item);
    }



}