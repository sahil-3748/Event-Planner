package com.example.eventplanner;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class LookingForFragment extends Fragment {

    int[] artisttype_image={R.drawable.venue,R.drawable.pandit,R.drawable.invitationcard,R.drawable.dj,R.drawable.catering,R.drawable.makeupartist,
                            R.drawable.mahendiartist,R.drawable.photographer,R.drawable.fashiondesigner,R.drawable.hairstylish,
                            R.drawable.driver,R.drawable.caronrent,R.drawable.horseforwedding,R.drawable.decorator,R.drawable.florist,
                            R.drawable.singer,R.drawable.anchor,R.drawable.choreographer,R.drawable.otherartist
    };
    String[] artist_text={"Venue","Pandit","Invitation card","DJ/Band","Cattering","Make-up Artist",
            "Mahendi Artist","Photographer","Fashion Designer","Hair Stylish","Driver","Car on rent","Horse on rent","Decorator",
            "Florist","Singer","Anchor","Choreographer","Other Artist"};

    public LookingForFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_looking_for, container, false);
        GridView categorygrid=view.findViewById(R.id.categorygrid);

        MainAdapter mainAdapter=new MainAdapter(getContext(),artisttype_image,artist_text);
        categorygrid.setAdapter(mainAdapter);

        categorygrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent artistlistintent=new Intent(getContext(),ArtistList.class);
                artistlistintent.putExtra("typeofartist",artist_text[i]);
                startActivity(artistlistintent);
            }
        });

        return view;
    }
}