package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import es.dmoral.toasty.Toasty;

public class CommanQuestion extends AppCompatActivity {

    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comman_question);

        Calendar calendar= Calendar.getInstance();
        final int year =calendar.get(Calendar.YEAR);
        final int month =calendar.get(Calendar.MONTH);
        final int day =calendar.get(Calendar.DAY_OF_MONTH);

        final TextView eventtitle=(TextView)findViewById(R.id.eventtitle);
        eventtitle.setText(getIntent().getStringExtra("event_title"));

        final String nameofevent=eventtitle.getText().toString();
        Button planningbtn=(Button)findViewById(R.id.planningbtn);

        final EditText eventdate_et=(EditText)findViewById(R.id.eventdate_et);
        eventdate_et.setHint("Select Date of the "+nameofevent+" event");

//        eventdate_et.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DatePickerDialog datePickerDialog=new DatePickerDialog(CommanQuestion.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,setListener,year,month,day);
//
//                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                datePickerDialog.show();
//            }
//        });
//
//         setListener=new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                month=month+1;
//                String date=day+"/"+month+"/"+year;
//                eventdate_et.setText(date);
//            }
//        };

        eventdate_et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(CommanQuestion.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month=month+1;
                        String date=day+"/"+month+"/"+year;
                        eventdate_et.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        planningbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eventtitle.getText().toString().equals("Engagement"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Marriage"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Baby Shower"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Birthday Party"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Anniversery Party"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Social Gathering"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Open Ceremony"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Funeral"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Garba night"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Open mic"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Sports Event"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else if (eventtitle.getText().toString().equals("Tours & Camps"))
                {
                    Intent atozplanningintent=new Intent(CommanQuestion.this,AtoZEventPlanning.class);
                    atozplanningintent.putExtra("senttitle",nameofevent);
                    startActivity(atozplanningintent);
                }
                else {
                    Toasty.error(getApplicationContext(),"Something went wrong.", Toasty.LENGTH_LONG).show();
                }


            }
        });

    }
}