package com.example.eventplanner;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Mylistadapter extends RecyclerView.Adapter<Mylistadapter.MylistViewHolder> {

    Context context;
    private int[] myimage;
    private String[] myname;
    private String[] myplace;
    private String[] mydate;

    public Mylistadapter(Context c, int[] myimage, String[] myname, String[] myplace, String[] mydate){
        context=c;
        this.myimage=myimage;
        this.myname=myname;
        this.myplace=myplace;
        this.mydate=mydate;
    }

    @NonNull
    @Override
    public MylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.eventlistadapter,parent,false);
        return new MylistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MylistViewHolder holder, final int position) {
        holder.myeventname.setText(myname[position]);
        holder.myeventplace.setText(myplace[position]);
        holder.myeventdate.setText(mydate[position]);
        holder.myeventimage.setImageResource(myimage[position]);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent datasendingintent=new Intent(context,DetailsAboutEvents.class);
                datasendingintent.putExtra("eventimg",myimage[position]);
                datasendingintent.putExtra("eventname",myname[position]);
                datasendingintent.putExtra("eventloc",myplace[position]);
                datasendingintent.putExtra("eventdate",mydate[position]);
                context.startActivity(datasendingintent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myname.length;
    }

    public class MylistViewHolder extends RecyclerView.ViewHolder {

        ImageView myeventimage;
        TextView myeventname;
        TextView myeventplace;
        TextView myeventdate;
        LinearLayout linearLayout;

        public MylistViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linear);
            myeventimage=(ImageView) itemView.findViewById(R.id.imageforevent);
            myeventname=(TextView) itemView.findViewById(R.id.nameforevent);
            myeventplace=(TextView) itemView.findViewById(R.id.placeforevent);
            myeventdate=(TextView) itemView.findViewById(R.id.dateforevent);
        }
    }
}
