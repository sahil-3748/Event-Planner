package com.example.eventplanner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.cardview.widget.CardView;

import es.dmoral.toasty.Toasty;

import static com.example.eventplanner.R.*;

public class DetailAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    int[] imageofartist;
    String[] nameofartist;
    String[] areaofartist;
    String[] ratingofartist;
    String[] priceofartist;
    Boolean saved=false;

    public DetailAdapter(Context c,int[] imageofartist,String[] nameofartist,String[] areaofartist,String[] ratingofartist,String[] priceofartist){
        context=c;
        this.imageofartist=imageofartist;
        this.nameofartist=nameofartist;
        this.areaofartist=areaofartist;
        this.ratingofartist=ratingofartist;
        this.priceofartist=priceofartist;
    }
    @Override
    public int getCount() {
        return imageofartist.length;
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
            view=inflater.inflate(layout.artist_in_detail,null);
        }

        final ImageView artistsaved=view.findViewById(id.artistsaved);


        artistsaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(artistsaved.equals(drawable.ic_baseline_bookmark_border_24)){
                    artistsaved.setImageResource(drawable.ic_baseline_bookmark_24);
                }
                else if(artistsaved.equals(drawable.ic_baseline_bookmark_24)){
                    artistsaved.setImageResource(drawable.ic_baseline_bookmark_border_24);
                }
                else{
                    artistsaved.setImageResource(drawable.ic_baseline_bookmark_border_24);
                }

            }
        });

        ImageView artistimageview=view.findViewById(id.artistimage);
        TextView artistnametxt=view.findViewById(id.artistname);
        TextView artistareatxt=view.findViewById(id.artistarea);
        TextView artistratingtxt=view.findViewById(id.artistrating);
        TextView artistpricetxt=view.findViewById(id.artistcharges);

        artistimageview.setImageResource(imageofartist[i]);
        artistnametxt.setText(nameofartist[i]);
        artistareatxt.setText(areaofartist[i]);
        artistratingtxt.setText(ratingofartist[i]);
        artistpricetxt.setText(priceofartist[i]);

        return view;
    }
}
