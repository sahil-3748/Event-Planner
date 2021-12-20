package com.example.eventplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DataAboutArtist extends AppCompatActivity {

    private BottomNavigationView detailviewnavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_about_artist);

        ImageView artistfeaturephoto=(ImageView)findViewById(R.id.artistfeatureimage);

        artistfeaturephoto.setImageResource(getIntent().getIntExtra("imageofartist",0));

        detailviewnavigation=findViewById(R.id.detailviewnavigation);
        detailviewnavigation.setOnNavigationItemSelectedListener(DetailNavigationMethod);

        getSupportFragmentManager().beginTransaction().replace(R.id.detail_container,new AboutFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener DetailNavigationMethod=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment=null;

            switch (menuItem.getItemId())
            {

                case R.id.about:
                    fragment=new AboutFragment();
                    break;

                case R.id.projects:
                    fragment=new ProjectFragment();
                    break;

                case R.id.review:
                    fragment=new ReviewFragment();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.detail_container,fragment).commit();
            return true;

        }

    };

}