package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.m1:

                Intent i=new Intent(this,Settings.class);
                startActivity(i);
                break;
            case R.id.m2:
                Intent y=new Intent(this,Whattsapp.class);
                startActivity(y);
                break;
            case R.id.m3:
                Intent z=new Intent(this,Accounts.class);
                startActivity(z);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
