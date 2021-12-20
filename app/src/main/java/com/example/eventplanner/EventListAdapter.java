package com.example.eventplanner;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import es.dmoral.toasty.Toasty;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventListViewHolder> {

    Context context;
    private int[] mybgimage;
    private int[] mymainimage;
    private String[] myeventname;

    public EventListAdapter(Context c,int[] mybgimage,int[] mymainimage,String[] myeventname){
        context=c;
        this.mybgimage=mybgimage;
        this.mymainimage=mymainimage;
        this.myeventname=myeventname;
    }

    @NonNull
    @Override
    public EventListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.eventlisttypelist,parent,false);
        return new EventListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventListViewHolder holder, final int position) {

     holder.eventbackground.setImageResource(mybgimage[position]);
     holder.eventmainimg.setImageResource(mymainimage[position]);
     holder.eventname.setText(myeventname[position]);

     holder.mainframe.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             final AlertDialog.Builder builder=new AlertDialog.Builder(v.getRootView().getContext());
             final View dialogueView=LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.custom_dialogue,null);
             ImageView successimage;
             TextView detailaboutevent;
             final TextView eventnamefordialogue;
             FrameLayout mainbackground;
             Button cancelbtn;
             Button okaybtn;
             successimage=dialogueView.findViewById(R.id.imageofsuccess);
             detailaboutevent=dialogueView.findViewById(R.id.eventdetailtext);
             eventnamefordialogue=dialogueView.findViewById(R.id.eventnamefordialogue);
             mainbackground=dialogueView.findViewById(R.id.mainbackground);
             cancelbtn=dialogueView.findViewById(R.id.cancelbtn);
             okaybtn=dialogueView.findViewById(R.id.okbtn);
             builder.setView(dialogueView);
             builder.setCancelable(true);
             builder.show();

             eventnamefordialogue.setText(myeventname[position]);
             successimage.setImageResource(mymainimage[position]);
             //mainbackground.setBackgroundResource(mybgimage[position]);
             //okaybtn.setBackgroundResource(mybgimage[position]);
             //cancelbtn.setBackgroundResource(mybgimage[position]);
             detailaboutevent.setText("Do you want to add or plan "+myeventname[position]+" Event?");

             okaybtn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                    Intent listofneccessaryintent=new Intent(context,CommanQuestion.class);
                    listofneccessaryintent.putExtra("event_title",myeventname[position]);
                    context.startActivity(listofneccessaryintent);
                 }
             });

             cancelbtn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                 }
             });
         }
     });

    }

    @Override
    public int getItemCount() {
        return myeventname.length;
    }

    public class EventListViewHolder extends RecyclerView.ViewHolder {

        FrameLayout mainframe;
        ImageView eventbackground;
        ImageView eventmainimg;
        TextView eventname;

        public EventListViewHolder(@NonNull View itemView) {
            super(itemView);
            mainframe =(FrameLayout)itemView.findViewById(R.id.mainframe);
            eventbackground=(ImageView)itemView.findViewById(R.id.bgimgforeve);
            eventmainimg=(ImageView)itemView.findViewById(R.id.mainforeve);
            eventname=(TextView)itemView.findViewById(R.id.nameforeve);

        }
    }
}