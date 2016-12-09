package com.example.a403.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;
    Switch switch1;
    Chronometer chronometer;
    RadioGroup rs;
    EditText e1, e2, e3;
    RadioButton radio1, radio2, radio3, radio4, radio5;
    ImageView img;
    LinearLayout linear1, linear2;
    double num11, num22, num33, result, dcreslut, price;
    TextView t1, t2, t3;
    TimePicker time;
    CalendarView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        chronometer = (Chronometer) findViewById(R.id.chronometer2);
        rs = (RadioGroup) findViewById(R.id.radioGroup);
        radio1 = (RadioButton) findViewById(R.id.radioButton6);
        radio2 = (RadioButton) findViewById(R.id.radioButton7);
        radio3 = (RadioButton) findViewById(R.id.radioButton8);
        radio4 = (RadioButton) findViewById(R.id.radioButton10);
        radio5 = (RadioButton) findViewById(R.id.radioButton11);
        img = (ImageView) findViewById(R.id.imageView2);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        switch1 = (Switch) findViewById(R.id.switch1);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        time = (TimePicker) findViewById(R.id.timePicker2);
        date = (CalendarView) findViewById(R.id.calendarView2);

        switch1.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linear1.setVisibility(View.VISIBLE);
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    chronometer.start();
                    chronometer.setTextColor(Color.RED);
                } else {
                    linear1.setVisibility(View.INVISIBLE);
                    chronometer.stop();
                    chronometer.setTextColor(Color.BLUE);
                }

            }
        });


        rs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (rs.getCheckedRadioButtonId() == R.id.radioButton6) {
                    img.setImageResource(R.drawable.num1);
                } else if (rs.getCheckedRadioButtonId() == R.id.radioButton7) {
                    img.setImageResource(R.drawable.num2);
                } else {
                    img.setImageResource(R.drawable.num3);
                }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num11 = Integer.parseInt(e1.getText().toString());
                num22 = Integer.parseInt(e2.getText().toString());
                num33 = Integer.parseInt(e3.getText().toString());
                result = num11 + num22 + num33;


                t1.setText("num: " + result);
                t2.setText("dcresult: ");
                t3.setText("price :");

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                linear2.setVisibility(View.VISIBLE);
            }
        });

        radio4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                time.setVisibility(View.INVISIBLE);
                date.setVisibility(View.VISIBLE);
            }
        });

        radio5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                time.setVisibility(View.VISIBLE);
                date.setVisibility(View.INVISIBLE);
            }
        });


    }
}
