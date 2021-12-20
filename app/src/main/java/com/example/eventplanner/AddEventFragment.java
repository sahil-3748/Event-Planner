package com.example.eventplanner;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AddEventFragment extends Fragment {

    int[] bgcolor={R.color.listcolorone,R.color.listcolortwo,R.color.listcolorthree,R.color.listcolorfour,
            R.color.listcolorfive,R.color.listcolorsix,R.color.listcolorseven,R.color.listcoloreight,
            R.color.listcolornine,R.color.listcolorten,R.color.listcoloreleven,R.color.listcolortwelve};

    int[] mainimage={R.drawable.ringceremony,R.drawable.marriage,R.drawable.babyshower,R.drawable.birthdayparty,
            R.drawable.anniversaryparty,R.drawable.socialgathering,R.drawable.openceremony,R.drawable.funeral,
            R.drawable.garbanights,R.drawable.openmic,R.drawable.sportsevent,R.drawable.camping};

    String[] eventname={"Engagement","Marriage","Baby Shower","Birthday Party",
            "Anniversery Party","Social Gathering","Open Ceremony","Funeral",
            "Garba night","Open mic","Sports Event","Tours & Camps"};

    public AddEventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_event, container, false);

        RecyclerView recycleforevents=(RecyclerView)view.findViewById(R.id.recycleforevents);
        EventListAdapter eventListAdapter=new EventListAdapter(getContext(),bgcolor,mainimage,eventname);
        recycleforevents.setAdapter(eventListAdapter);
        recycleforevents.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));



        return view;
    }
}