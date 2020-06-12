package com.example.examplework;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SecondRequest extends Worker{
    String text;
    public SecondRequest(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        text=getInputData().getString("key");
    }

    @NonNull
    @Override
    public Result doWork() {
        Log .i("yaseen",text);
        return Result.success();
    }
}
