package com.example.calendarappjavap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Button2_Activity extends MainActivity {
    private Button button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_2);
        Spinner mySpinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
        Global.hour= mySpinner.getSelectedItem().toString();

        myDate = (TextView) findViewById(R.id.myDate);
        myDate.setText(Global.date);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewfile();
            }
        });


    }
    public void opennewfile() {

        Intent intent = new Intent(this, Button_Activity.class);
        startActivity(intent);


    }


}
