package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import es.dmoral.toasty.Toasty;

public class AtoZEventPlanning extends AppCompatActivity {

    int[] birthday_image={R.drawable.venue,R.drawable.dj,R.drawable.catering,R.drawable.photographer,R.drawable.decorator,
            R.drawable.singer,R.drawable.otherartist};
    String[] birthday_text={"Venue","DJ/Band","Cattering","Photographer","Decorator",
            "Singer","Other Artist"};

    int[] engagement_image={R.drawable.venue,R.drawable.pandit,R.drawable.catering,R.drawable.makeupartist,
            R.drawable.mahendiartist,R.drawable.photographer,R.drawable.decorator,R.drawable.florist,};

    String[] engagement_text={"Venue","Pandit","Cattering","Make-up Artist",
            "Mahendi Artist","Photographer","Decorator","Florist"};


    int[] artisttype_image={R.drawable.venue,R.drawable.pandit,R.drawable.invitationcard,R.drawable.dj,R.drawable.catering,R.drawable.makeupartist,
            R.drawable.mahendiartist,R.drawable.photographer,R.drawable.fashiondesigner,R.drawable.hairstylish,
            R.drawable.driver,R.drawable.caronrent,R.drawable.horseforwedding,R.drawable.decorator,R.drawable.florist,
            R.drawable.singer,R.drawable.anchor,R.drawable.choreographer,R.drawable.otherartist
    };
    String[] artist_text={"Venue","Pandit","Invitation card","DJ/Band","Cattering","Make-up Artist",
            "Mahendi Artist","Photographer","Fashion Designer","Hair Stylish","Driver","Car on rent","Horse on rent","Decorator",
            "Florist","Singer","Anchor","Choreographer","Other Artist"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ato_zevent_planning);

        TextView planning_title=(TextView)findViewById(R.id.planningtitle);
        planning_title.setText("Plan " +getIntent().getStringExtra("senttitle"));
        GridView artisttypegrid=(GridView)findViewById(R.id.artisttypegrid);

        if(planning_title.getText().toString().equals("Plan Engagement")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,engagement_image,engagement_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Plan Marriage")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Plan Baby Shower")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Plan Birthday Party")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,birthday_image,birthday_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Anniversery Party")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Social Gathering")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Open Ceremony")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Funeral")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Garba night")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Open mic")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Sports Event")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else if (planning_title.getText().toString().equals("Tours & Camps")){
            MainAdapter mainAdapter=new MainAdapter(AtoZEventPlanning.this,artisttype_image,artist_text);
            artisttypegrid.setAdapter(mainAdapter);
        }
        else {
            Toasty.error(getApplicationContext(),"Somrthing went wrong.",Toasty.LENGTH_LONG).show();
        }
    }
}