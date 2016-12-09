package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    Switch switch1;
    Chronometer chronometer;
    RadioGroup rs;
    EditText e1,e2,e3;
    RadioButton radio1,radio2,radio3;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        chronometer=(Chronometer)findViewById(R.id.chronometer2);
        rs=(RadioGroup)findViewById(R.id.radioGroup);
        radio1=(RadioButton)findViewById(R.id.radioButton6);
        radio2=(RadioButton)findViewById(R.id.radioButton7);
        radio3=(RadioButton)findViewById(R.id.radioButton8);
        img=(ImageView)findViewById(R.id.imageView2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);



    }
}
