package com.example.eventplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter{

    private Context context;
    private LayoutInflater inflater;
    private int[] type_artist_image;
    private String[] type_artist_text;

    public MainAdapter(Context c,int[] type_artist_image,String[] type_artist_text){
        context=c;
        this.type_artist_image=type_artist_image;
        this.type_artist_text=type_artist_text;
    }

    @Override
    public int getCount() {
        return type_artist_text.length;
    }

    @Override
    public Object getItem(int position) {
        return getItemId(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(inflater==null){
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view==null){
            view=inflater.inflate(R.layout.artist_category,null);
        }

        ImageView categoryimageview=view.findViewById(R.id.artistimageview);
        TextView categorytextview=view.findViewById(R.id.artisttextview);

        categoryimageview.setImageResource(type_artist_image[position]);
        categorytextview.setText(type_artist_text[position]);

        return view;

    }
}