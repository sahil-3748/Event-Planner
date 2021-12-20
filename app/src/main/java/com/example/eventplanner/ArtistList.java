package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtistList extends AppCompatActivity {

    int[] artistimage={R.drawable.pandit,R.drawable.dj,R.drawable.catering};
    String[] artistname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] artistarea={"Setelite","Vijay Cross road","Bopal"};
    String[] artistrating={"5/5","4/5","3/5"};
    String[] artistprice={"10000","12000","15000"};

    int[] panditimage={R.drawable.pandit,R.drawable.pandit,R.drawable.pandit};
    String[] panditname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] panditarea={"Setelite","Vijay Cross road","Bopal"};
    String[] panditrating={"5/5","4/5","3/5"};
    String[] panditprice={"10000","12000","15000"};

    int[] djimage={R.drawable.dj,R.drawable.dj,R.drawable.dj};
    String[] djname={"Rakesh Patel","Raman Bhatt","Vijay Trivedi"};
    String[] djarea={"Setelite","Vijay Cross road","Bopal"};
    String[] djrating={"5/5","4/5","3/5"};
    String[] djprice={"10000","12000","15000"};

    int[] cateringimage={R.drawable.catering,R.drawable.catering,R.drawable.catering};
    String[] cateringname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] cateringarea={"Setelite","Vijay Cross road","Bopal"};
    String[] cateringrating={"5/5","4/5","3/5"};
    String[] cateringprice={"10000","12000","15000"};

    int[] makeupimage={R.drawable.makeupartist,R.drawable.makeupartist,R.drawable.makeupartist};
    String[] makeupname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] makeuparea={"Setelite","Vijay Cross road","Bopal"};
    String[] makeuprating={"5/5","4/5","3/5"};
    String[] makeupprice={"10000","12000","15000"};

    int[] mahendiimage={R.drawable.mahendiartist,R.drawable.mahendiartist,R.drawable.mahendiartist};
    String[] mahendiname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] mahendiarea={"Setelite","Vijay Cross road","Bopal"};
    String[] mahendirating={"5/5","4/5","3/5"};
    String[] mahendiprice={"10000","12000","15000"};

    int[] photographerimage={R.drawable.photographer,R.drawable.photographer,R.drawable.photographer};
    String[] photographername={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] photographerarea={"Setelite","Vijay Cross road","Bopal"};
    String[] photographerrating={"5/5","4/5","3/5"};
    String[] photographerprice={"10000","12000","15000"};

    int[] fashiondesignerimage={R.drawable.fashiondesigner,R.drawable.fashiondesigner,R.drawable.fashiondesigner};
    String[] fashiondesignername={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] fashiondesignerarea={"Setelite","Vijay Cross road","Bopal"};
    String[] fashiondesignerrating={"5/5","4/5","3/5"};
    String[] fashiondesignerprice={"10000","12000","15000"};

    int[] hairstylishimage={R.drawable.hairstylish,R.drawable.hairstylish,R.drawable.hairstylish};
    String[] hairstylishname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] hairstylisharea={"Setelite","Vijay Cross road","Bopal"};
    String[] hairstylishrating={"5/5","4/5","3/5"};
    String[] hairstylishprice={"10000","12000","15000"};

    int[] driverimage={R.drawable.driver,R.drawable.driver,R.drawable.driver};
    String[] drivername={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] driverarea={"Setelite","Vijay Cross road","Bopal"};
    String[] driverrating={"5/5","4/5","3/5"};
    String[] driverprice={"10000","12000","15000"};

    int[] horseimage={R.drawable.horseforwedding,R.drawable.horseforwedding,R.drawable.horseforwedding};
    String[] horsename={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] horsearea={"Setelite","Vijay Cross road","Bopal"};
    String[] horserating={"5/5","4/5","3/5"};
    String[] horseprice={"10000","12000","15000"};

    int[] decoratorimage={R.drawable.decorator,R.drawable.decorator,R.drawable.decorator};
    String[] decoratorname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] decoratorarea={"Setelite","Vijay Cross road","Bopal"};
    String[] decoratorrating={"5/5","4/5","3/5"};
    String[] decoratorprice={"10000","12000","15000"};

    int[] floristimage={R.drawable.florist,R.drawable.florist,R.drawable.florist};
    String[] floristname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] floristarea={"Setelite","Vijay Cross road","Bopal"};
    String[] floristrating={"5/5","4/5","3/5"};
    String[] floristprice={"10000","12000","15000"};

    int[] singerimage={R.drawable.singer,R.drawable.singer,R.drawable.singer};
    String[] singername={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] singerarea={"Setelite","Vijay Cross road","Bopal"};
    String[] singerrating={"5/5","4/5","3/5"};
    String[] singerprice={"10000","12000","15000"};

    int[] anchorimage={R.drawable.anchor,R.drawable.anchor,R.drawable.anchor};
    String[] anchorname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] anchorarea={"Setelite","Vijay Cross road","Bopal"};
    String[] anchorrating={"5/5","4/5","3/5"};
    String[] anchorprice={"10000","12000","15000"};

    int[] choreographerimage={R.drawable.choreographer,R.drawable.choreographer,R.drawable.choreographer};
    String[] choreographername={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] choreographerarea={"Setelite","Vijay Cross road","Bopal"};
    String[] choreographerrating={"5/5","4/5","3/5"};
    String[] choreographerprice={"10000","12000","15000"};

    int[] otherartistimage={R.drawable.otherartist,R.drawable.otherartist,R.drawable.otherartist};
    String[] otherartistname={"Karshan Pandit","Raman Bhatt","Vijay Trivedi"};
    String[] otherartistarea={"Setelite","Vijay Cross road","Bopal"};
    String[] otherartistrating={"5/5","4/5","3/5"};
    String[] otherartistprice={"10000","12000","15000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        TextView artisttitle=(TextView)findViewById(R.id.artist_title);
        GridView artistdetailgrid=(GridView)findViewById(R.id.artistdetailgrid);

        artisttitle.setText(getIntent().getStringExtra("typeofartist"));

        String artisttytpe=artisttitle.getText().toString();

        artistdetailgrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent dataaboutartistintent=new Intent(ArtistList.this,DataAboutArtist.class);
                dataaboutartistintent.putExtra("imageofartist",panditimage[i]);
                startActivity(dataaboutartistintent);
            }
        });

        switch (artisttytpe){

            case "Pandit":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,panditimage,panditname,panditarea,panditrating,panditprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "DJ/Band":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,djimage,djname,djarea,djrating,djprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Cattering":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,cateringimage,cateringname,cateringarea,cateringrating,cateringprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Make-up Artist":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,makeupimage,makeupname,makeuparea,makeuprating,makeupprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Mahendi Artist":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,mahendiimage,mahendiname,mahendiarea,mahendirating,mahendiprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Photographer":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,photographerimage,photographername,photographerarea,photographerrating,photographerprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Fashion Designer":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,fashiondesignerimage,fashiondesignername,fashiondesignerarea,fashiondesignerrating,fashiondesignerprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Hair Stylish":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,hairstylishimage,hairstylishname,hairstylisharea,hairstylishrating,hairstylishprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Driver":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,driverimage,drivername,driverarea,driverrating,driverprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Horse for Wedding":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,horseimage,horsename,horsearea,horserating,horseprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Decorator":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,decoratorimage,decoratorname,decoratorarea,decoratorrating,decoratorprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Florist":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,floristimage,floristname,floristarea,floristrating,floristprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Singer":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,singerimage,singername,singerarea,singerrating,singerprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Anchor":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,anchorimage,anchorname,anchorarea,anchorrating,anchorprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Choreographer":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,choreographerimage,choreographername,choreographerarea,choreographerrating,choreographerprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            case "Other Artist":
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,otherartistimage,otherartistname,otherartistarea,otherartistrating,otherartistprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
            default:
            {
                DetailAdapter fetchdetail=new DetailAdapter(ArtistList.this,artistimage,panditname,panditarea,panditrating,panditprice);
                artistdetailgrid.setAdapter(fetchdetail);
                break;
            }
        }
    }
}