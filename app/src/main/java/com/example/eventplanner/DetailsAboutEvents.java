package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsAboutEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_about_events);

        ImageView eventmainimage=(ImageView)findViewById(R.id.maineventimage);
        TextView eventmainname=(TextView)findViewById(R.id.maineventname);
        TextView eventmainlocation=(TextView)findViewById(R.id.maineventlocation);
        TextView eventmaindate=(TextView)findViewById(R.id.maineventdate);
        final CardView phoneredirect=(CardView)findViewById(R.id.callredirect);
        CardView emailredirect=(CardView)findViewById(R.id.mailredirect);

        eventmainimage.setImageResource(getIntent().getIntExtra("eventimg",0));
        eventmainname.setText(getIntent().getStringExtra("eventname"));
        eventmainlocation.setText(getIntent().getStringExtra("eventloc"));
        eventmaindate.setText(getIntent().getStringExtra("eventdate"));

        phoneredirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phoneredirectintent=new Intent(Intent.ACTION_DIAL);
                phoneredirectintent.setData(Uri.parse("tel:7016878751"));
                startActivity(phoneredirectintent);
            }
        });
    }
}