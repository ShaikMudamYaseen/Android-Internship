package com.example.examplework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    OneTimeWorkRequest firstrequest,secondrequest;
    PeriodicWorkRequest thirdwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constraints c =new Constraints.Builder().setRequiresCharging(true).setRequiredNetworkType(NetworkType.CONNECTED).build();
        firstrequest=new OneTimeWorkRequest.Builder(Firstwork.class).setConstraints(c).build();
        thirdwork=new PeriodicWorkRequest.Builder(Thirdwork.class,15, TimeUnit.MINUTES).build();
        Data data =new Data.Builder().putString("key","this is second request").build();
        secondrequest=new OneTimeWorkRequest.Builder(SecondRequest.class).setInputData(data).build();
    }

    public void alert(View view) {
        WorkManager.getInstance(this).enqueue(firstrequest);
        WorkManager.getInstance(this).enqueue(secondrequest);
        WorkManager.getInstance(this).enqueue(thirdwork);
    }
}
