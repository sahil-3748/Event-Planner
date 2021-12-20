package com.example.eventplanner;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeFragment extends Fragment {

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

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        TextView openmiceventlayout=view.findViewById(R.id.openmiceventlayout);
        TextView bussineseventlayout=view.findViewById(R.id.bussineseventlayout);
        TextView workshopeventlayout=view.findViewById(R.id.workshopeventlayout);
        TextView exhibitioneventlayout=view.findViewById(R.id.exhibitioneventlayout);
        TextView socialeventlayout=view.findViewById(R.id.socialeventlayout);
        TextView onlineeventlayout=view.findViewById(R.id.onlineeventlayout);
        TextView sportseventlayout=view.findViewById(R.id.sportseventlayout);
        TextView theaterndshowlayout=view.findViewById(R.id.theatorndshowlayout);
        TextView tourndcamplayout=view.findViewById(R.id.tourndcamplayout);

        final String openmictittle="Open-mic Events";
        final String bussinesseventtittle="Bussiness Events";
        final String workshopstitle="Workshops";
        final String exhibitionstitle="Exhibitions";
        final String socialeventtitile="Social Events";
        final String onlineeventtitle="Online Events";
        final String sportseventtitle="Sports Event";
        final String theaterndshowtitile="Theater & Shows";
        final String tourndcamptitle="Tours & Camps";

        Mylistadapter openmiclistadapter=new Mylistadapter(getContext(),openmiceventimage,openmiceventname,openmiceventplace,openmiceventdate);
        Mylistadapter bussinesslistadapter=new Mylistadapter(getContext(),bussinesseventimage,bussinesseventname,bussinesseventplace,bussinesseventdate);
        Mylistadapter workshoplistadapter=new Mylistadapter(getContext(),workshopimage,workshopname,workshopplace,workshopdate);
        Mylistadapter exhibitionlistadapter=new Mylistadapter(getContext(),exhibitionimage,exhibitionname,exhibitionplace,exhibitiondate);
        Mylistadapter socialeventlistadapter=new Mylistadapter(getContext(),socialeventimage,socialeventname,socialeventplace,socialeventdate);
        Mylistadapter onlineeventlistadapter=new Mylistadapter(getContext(),onlineeventimage,onlineeventname,onlineeventplace,onlineeventdate);

        RecyclerView openmiclist=(RecyclerView)view.findViewById(R.id.openmiceventlist);
        openmiclist.setAdapter(openmiclistadapter);
        openmiclist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        openmiceventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",openmictittle);
                startActivity(openmiceventintent);
            }
        });

        RecyclerView bussineslist=(RecyclerView)view.findViewById(R.id.bussinesslist);
        bussineslist.setAdapter(bussinesslistadapter);
        bussineslist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        bussineseventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",bussinesseventtittle);
                startActivity(openmiceventintent);
            }
        });


        RecyclerView workshoplist=(RecyclerView)view.findViewById(R.id.workshoplist);
        workshoplist.setAdapter(workshoplistadapter);
        workshoplist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        workshopeventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",workshopstitle);
                startActivity(openmiceventintent);
            }
        });

        RecyclerView exhibitionlist=(RecyclerView)view.findViewById(R.id.exhibitionslist);
        exhibitionlist.setAdapter(exhibitionlistadapter);
        exhibitionlist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        exhibitioneventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",exhibitionstitle);
                startActivity(openmiceventintent);
            }
        });


        RecyclerView socialeventlist=(RecyclerView)view.findViewById(R.id.socialeventlist);
        socialeventlist.setAdapter(socialeventlistadapter);
        socialeventlist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        socialeventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",socialeventtitile);
                startActivity(openmiceventintent);
            }
        });

        RecyclerView onlineeventlist=(RecyclerView)view.findViewById(R.id.onlineeventlist);
        onlineeventlist.setAdapter(onlineeventlistadapter);
        onlineeventlist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        onlineeventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",onlineeventtitle);
                startActivity(openmiceventintent);
            }
        });

        RecyclerView sportseventlist=(RecyclerView)view.findViewById(R.id.sportseventlist);
        sportseventlist.setAdapter(openmiclistadapter);
        sportseventlist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        sportseventlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",sportseventtitle);
                startActivity(openmiceventintent);
            }
        });

        RecyclerView tourndcamplist=(RecyclerView)view.findViewById(R.id.tourndcamplist);
        tourndcamplist.setAdapter(openmiclistadapter);
        tourndcamplist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        tourndcamplayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(   getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",tourndcamptitle);
                startActivity(openmiceventintent);
            }
        });

        RecyclerView theaterndshowslist=(RecyclerView)view.findViewById(R.id.theatorndshowlist);
        theaterndshowslist.setAdapter(openmiclistadapter);
        theaterndshowslist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        theaterndshowlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openmiceventintent=new Intent(getContext(),ListofEvents.class);
                openmiceventintent.putExtra("title",theaterndshowtitile);
                startActivity(openmiceventintent);
            }
        });

        return view;

    }
}