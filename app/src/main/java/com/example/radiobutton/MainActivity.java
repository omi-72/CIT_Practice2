package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    RadioGroup rd_group;
    RadioButton rd_btn_male, rd_btn_female;
    CheckBox chk_terms;

    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName= findViewById(R.id.userName);
        rd_group= findViewById(R.id.rd_group);
        rd_btn_male= findViewById(R.id.rd_btn_male);
        rd_btn_female= findViewById(R.id.rd_btn_female);
        chk_terms= findViewById(R.id.chk_terms);
        btn_submit=findViewById(R.id.btn_submit);

    }
}