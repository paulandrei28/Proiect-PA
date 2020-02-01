package com.example.calendarappjavap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class Button_Activity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_);
        myDate = (TextView) findViewById(R.id.myDate);
        myDate.setText(Global.date);
        myHour = (TextView) findViewById(R.id.myHour);
        myHour.setText(Global.hour);

        /*
        final EditText nameField = (EditText) findViewById(R.id.EditTextName);
                String name = nameField.getText().toString();

                final EditText emailField = (EditText) findViewById(R.id.EditTextPhone);
                String email = emailField.getText().toString();

                final Spinner feedbackSpinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
                String feedbackType = feedbackSpinner.getSelectedItem().toString();
        */

    }
    public void sendFeedback(View button2) {
        // Do click handling here
    }
}
