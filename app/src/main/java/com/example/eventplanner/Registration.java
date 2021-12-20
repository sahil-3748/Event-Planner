package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class Registration extends AppCompatActivity {

    DatePickerDialog.OnDateSetListener setListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Calendar calendar= Calendar.getInstance();
        TextView signtologin=(TextView)findViewById(R.id.signtolog_txt);
        Button signinbutton=(Button)findViewById(R.id.signin_btn);
        final int year =calendar.get(Calendar.YEAR);
        final int month =calendar.get(Calendar.MONTH);
        final int day =calendar.get(Calendar.DAY_OF_MONTH);
        final EditText birthdate=(EditText)findViewById(R.id.birthdate_et);

//        birthdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DatePickerDialog datePickerDialog=new DatePickerDialog(Registration.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,setListener,year,month,day);
//
//                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                datePickerDialog.show();
//            }
//        });

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signinintent=new Intent(Registration.this,UserMain.class);
                startActivity(signinintent);
            }
        });

//        setListener =new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                month=month+1;
//                String date=day+"/"+month+"/"+year;
//                birthdate.setText(date);
//            }
//        };

        signtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signtologinintent=new Intent(Registration.this,Login.class);
                startActivity(signtologinintent);
            }
        });

        birthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(Registration.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month=month+1;
                        String date=day+"/"+month+"/"+year;
                        birthdate.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

    }
}