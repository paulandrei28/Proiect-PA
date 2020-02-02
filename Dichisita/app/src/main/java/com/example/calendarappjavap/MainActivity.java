package com.example.calendarappjavap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView myDate,myHour;
    String luna;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewfile();
            }
        });


        calendarView = (CalendarView) findViewById(R.id.calendarView);
        myDate = (TextView) findViewById(R.id.myDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                if(2>1) {
                    if (month + 1 == 1) {
                        luna = "Ianuarie";
                    }
                    if (month + 1 == 2) {
                        luna = "Februarie";
                    }
                    if (month + 1 == 3) {
                        luna = "Martie";
                    }
                    if (month + 1 == 4) {
                        luna = "Aprilie";
                    }
                    if (month + 1 == 5) {
                        luna = "Mai";
                    }
                    if (month + 1 == 6) {
                        luna = "Iunie";
                    }
                    if (month + 1 == 7) {
                        luna = "Iulie";
                    }
                    if (month + 1 == 8) {
                        luna = "August";
                    }
                    if (month + 1 == 9) {
                        luna = "Septembrie";
                    }
                    if (month + 1 == 10) {
                        luna = "Octombrie";
                    }
                    if (month + 1 == 11) {
                        luna = "Noiembrie";
                    }
                    if (month + 1 == 12) {
                        luna = "Decembrie";
                    }
                }
                Global.date = day + " " + luna + " " + year;
                myDate.setText(Global.date);
            }

        });
    }
    public void opennewfile() {

        Intent intent = new Intent(this, Button2_Activity.class);
        startActivity(intent);


    }
}

