package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class ListofEvents extends AppCompatActivity {


    int[] openmiceventimage={R.drawable.storytellingshow,R.drawable.nayajanamopenmic,R.drawable.apnaopenmic};
    String[] openmiceventname={"Storytelling show ","Naya janam Open-mic","Apana Open-mic"};
    String[] openmiceventplace={"Ahmedabad","Ahmedabad","Ahmedabad"};
    String[] openmiceventdate={"15th Apr","21th Apr","28th Apr"};

    int[] bussinesseventimage={R.drawable.bussinesseventone,R.drawable.bussinesevent,R.drawable.bussinesevent};
    String[] bussinesseventname={"Bussiness Conference 2021","Networking & Start-up","Global bussiness Summit 2021"};
    String[] bussinesseventplace={"Ahmedabad","Ahmedabad","Gandhinagar"};
    String[] bussinesseventdate={"13th Aug","26th Jan","30th Apr"};

    int[] workshopimage={R.drawable.workshopone,R.drawable.workshoptwo,R.drawable.workshopthree};
    String[] workshopname={"Mulaqat (Workshop of Urdu Ghazal)","Importance of storytelling in Marketing","Screening Lesson from dark comedies"};
    String[] workshopplace={"Ahmedabad","Ahmedabad","Gandhinagar"};
    String[] workshopdate={"04th Apr","03rd Apr","04th Apr"};

    int[] exhibitionimage={R.drawable.artexhibition,R.drawable.photographyexhibition,R.drawable.paintingexhibition};
    String[] exhibitionname={"Premium Fashion & Lifestyle","Aspiration Wedding saga","Surat Intternational Textile Expo 2021"};
    String[] exhibitionplace={"Surat","Ahmedabad","Surat"};
    String[] exhibitiondate={"05th Apr","10th Apr","15th Apr"};

    int[] socialeventimage={R.drawable.itsopenmicevent,R.drawable.itsopenmicevent,R.drawable.itsopenmicevent};
    String[] socialeventname={"Naya janam Open-mic","Mehfil Open-mic","Apana Open-mic"};
    String[] socialeventplace={"Ahmedabad","Ahmedabad","Gandhinagar"};
    String[] socialeventdate={"13th Aug","26th Jan","30th Apr"};

    int[] onlineeventimage={R.drawable.onlineone,R.drawable.onlinetwo,R.drawable.onlinethree};
    String[] onlineeventname={"Naya janam Open-mic","Mehfil Open-mic","Apana Open-mic"};
    String[] onlineeventplace={"Online on Zoom","Online on Zoom","Online on Zoom"};
    String[] onlineeventdate={"13th Aug","26th Jan","30th Apr"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_events);

        GridView eventslist=(GridView)findViewById(R.id.eventlistgrid);
        TextView titleofevent=(TextView)findViewById(R.id.titleodevent);

        titleofevent.setText(getIntent().getStringExtra("title"));

        String titleonevent=titleofevent.getText().toString();

        switch (titleonevent){
            case "Open-mic Events":
            {
                EventAdapter eventAdapter=new EventAdapter(ListofEvents.this,openmiceventimage,openmiceventname,openmiceventplace,openmiceventdate);
                eventslist.setAdapter(eventAdapter);
                break;
            }
            case "Bussiness Events":
            {
                EventAdapter eventAdapter=new EventAdapter(ListofEvents.this,bussinesseventimage,bussinesseventname,bussinesseventplace,bussinesseventdate);
                eventslist.setAdapter(eventAdapter);
                break;
            }

            case "Workshops":
            {
                EventAdapter eventAdapter=new EventAdapter(ListofEvents.this,workshopimage,workshopname,workshopplace,workshopdate);
                eventslist.setAdapter(eventAdapter);
                break;
            }
            case "Exhibitions":
            {
                EventAdapter eventAdapter=new EventAdapter(ListofEvents.this,exhibitionimage,exhibitionname,exhibitionplace,exhibitiondate);
                eventslist.setAdapter(eventAdapter);
                break;
            }
            case "Social Events":
            {
                EventAdapter eventAdapter=new EventAdapter(ListofEvents.this,socialeventimage,socialeventname,socialeventplace,socialeventdate);
                eventslist.setAdapter(eventAdapter);
                break;
            }
            case "Online Events":
            {
                EventAdapter eventAdapter=new EventAdapter(ListofEvents.this,onlineeventimage,onlineeventname,onlineeventplace,onlineeventdate);
                eventslist.setAdapter(eventAdapter);
                break;
            }
        }



    }
}