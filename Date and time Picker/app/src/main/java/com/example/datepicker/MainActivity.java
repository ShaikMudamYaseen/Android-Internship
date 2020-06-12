package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int year,month,day,hour,min;
    boolean bool;
    TextView tv,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        tv1=findViewById(R.id.tv1);

    }

    public void date(View view) {
        Calendar c=Calendar.getInstance();
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dp=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tv.setText(""+year+"-"+(month+1)+"-"+dayOfMonth);


            }


        },year,month,day);
        dp.show();
    }

    public void time(View view) {
        Calendar c=Calendar.getInstance();
        hour=c.get(Calendar.HOUR_OF_DAY);
        min=c.get(Calendar.MINUTE);

        TimePickerDialog tp=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tv1.setText(""+hourOfDay+" : "+minute);
            }
        },hour,min,false);
        tp.show();


    }
}
