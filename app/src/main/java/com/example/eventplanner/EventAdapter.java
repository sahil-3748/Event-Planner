package com.example.eventplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private int[] eventimage;
    private String[] eventname;
    private String[] eventplace;
    private String[] eventdate;

    public EventAdapter(Context c,int[] eventimage,String[] eventname,String[] eventplace,String[] eventdate){
        context=c;
        this.eventimage=eventimage;
        this.eventname=eventname;
        this.eventplace=eventplace;
        this.eventdate=eventdate;
    }
    @Override
    public int getCount() {
        return eventimage.length;
    }

    @Override
    public Object getItem(int i) {
        return getItemId(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflater==null){
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view==null){
            view=inflater.inflate(R.layout.eventlistadapter,null);
        }

        ImageView imageofevent=view.findViewById(R.id.imageforevent);

        TextView nameofevent=view.findViewById(R.id.nameforevent);
        TextView placeofevent=view.findViewById(R.id.placeforevent);
        TextView dateofevent=view.findViewById(R.id.dateforevent);

        imageofevent.setImageResource(eventimage[i]);
        nameofevent.setText(eventname[i]);
        placeofevent.setText(eventplace[i]);
        dateofevent.setText(eventdate[i]);

        return view;
    }
}
