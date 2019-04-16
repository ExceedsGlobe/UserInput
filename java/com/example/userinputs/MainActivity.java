package com.example.userinputs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText weekDays;
EditText weekEnds;
TextView resultsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        weekDays=findViewById(R.id.wDaysHours);
        weekEnds=findViewById(R.id.wEndsHours);
        resultsTxt=findViewById(R.id.results);

    }
    public void checkResults(View view){
        int wDaysSleepingHours=Integer.parseInt(weekDays.getText().toString());
        int wEndsSleepingHours=Integer.parseInt(weekEnds.getText().toString());
        int hoursSlept=(wDaysSleepingHours*5)+(wEndsSleepingHours*2);
        int requiredSleep=7*8;
        int sleepDebt=requiredSleep-hoursSlept;
        resultsTxt.setText(String.valueOf(sleepDebt));

    }

}
