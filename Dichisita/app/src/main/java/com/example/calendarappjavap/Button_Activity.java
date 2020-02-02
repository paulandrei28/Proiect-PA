package com.example.calendarappjavap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.EditText;

import java.util.PropertyPermission;

public class Button_Activity extends MainActivity {
    TextView lst;
   // Programare programare;
    MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_);
       /* programare.setOra("10:00");
        programare.setNume("paul");
        programare.setNumarTel("0744371312");
        programare.setTipProgramare("test");

        dbHandler.addHandler(programare);
        lst = (TextView) findViewById(R.id.myList);
        lst.setText(dbHandler.loadHandler());

        Button button3 = (Button) findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadProgramari(v);
            }
        });*/

        myDate = (TextView) findViewById(R.id.myDate);
        myDate.setText(Global.date);
        myHour = (TextView) findViewById(R.id.myHour);
        myHour.setText(Global.hour);

        /*
                final EditText nameField = (EditText) findViewById(R.id.EditTextName);
                String name = nameField.getText().toString();

                final EditText phoneField = (EditText) findViewById(R.id.EditTextPhone);
                String phone = phoneField.getText().toString();

                final Spinner feedbackSpinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
                String feedbackType = feedbackSpinner.getSelectedItem().toString();
        */

    }
    public void loadProgramari(View view) {
        MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);
        lst.setText(dbHandler.loadHandler());

    }
}
