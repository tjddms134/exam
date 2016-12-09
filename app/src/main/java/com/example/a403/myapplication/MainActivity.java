package com.example.a403.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;
    Switch switch1;
    Chronometer chronometer;
    RadioGroup rs;
    EditText e1, e2, e3;
    RadioButton radio1, radio2, radio3;
    ImageView img;
    LinearLayout linear1;
    double num1,num2,num3,result,dcreslut,price;
    TextView t1,t2,t3;
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
        img = (ImageView) findViewById(R.id.imageView2);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        switch1 = (Switch) findViewById(R.id.switch1);
        linear1 = (LinearLayout) findViewById(R.id.linear1);


        switch1.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linear1.setVisibility(View.VISIBLE);
                } else {
                    linear1.setVisibility(View.INVISIBLE);
                }

                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                chronometer.setTextColor(Color.RED);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                num3 = Integer.parseInt(e3.getText().toString());
                result=num1+num2+num3;

                radio1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        dcreslut=result*0.05;
                        price=result-dcreslut;
                    }
                });
                radio2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        dcreslut=result*0.1;
                        price=result-dcreslut;
                    }
                });
                radio3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        dcreslut=result*0.2;
                        price=result-dcreslut;
                    }
                });
                t1.setText("num: "+result);
                t2.setText("dcresult: "+dcreslut);
                t3.setText("price :"+price);





            }
        });
    }
}
