package com.tas_productions.allinone;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button amazon,flipkart,snapdeal,clubfactory,medium,
        fb,twitter,insta,quora,tiktok,
        youtube,zomato,swiggy,reddit,illuminati,
        pinterest,ola,olx,imdb,byju,
        udemy,uber,mmt,khan,unacdemy,
        netflix,oyo,courseera,hackerrank,linkedin;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUPUI();
    }

    private void setUPUI() {
    linkedin = findViewById(R.id.linkedinButtonID);
    hackerrank =  findViewById(R.id.hackerrankID);
    courseera = findViewById(R.id.courseeraID);
    oyo = findViewById(R.id.oyoID);
    medium = findViewById(R.id.mediumButtonID);

    unacdemy = findViewById(R.id.unacdemyID);
    khan = findViewById(R.id.khanacademyID);
    mmt = findViewById(R.id.makemytripID);
    uber = findViewById(R.id.uberID);
    udemy = findViewById(R.id.udemyID);

    byju = findViewById(R.id.byjuID);
    tiktok = findViewById(R.id.tiktokID);
    olx = findViewById(R.id.olxID);
    ola = findViewById(R.id.olaID);
    reddit = findViewById(R.id.redditButtonID);

    quora = findViewById(R.id.quoraID);
    illuminati = findViewById(R.id.illuminatiID);
    clubfactory = findViewById(R.id.clubfactoryButtonID);
    amazon = findViewById(R.id.amazonButtonID);
    flipkart = findViewById(R.id.flipkartButtonID);

    snapdeal = findViewById(R.id.snapdealButtonID);
    fb = findViewById(R.id.facebookButtonID);
    twitter = findViewById(R.id.twitterButtonID);
    insta = findViewById(R.id.instaButtonID);
    youtube = findViewById(R.id.youtubeButtonID);

    zomato = findViewById(R.id.zomatoButtonID);
    swiggy = findViewById(R.id.swiggyButtonID);
    pinterest = findViewById(R.id.pinterestButtonID);
    imdb = findViewById(R.id.imdbButtonID);
    netflix = findViewById(R.id.netflixButtonID);

        amazon.setOnClickListener(this);
        flipkart.setOnClickListener(this);
        clubfactory.setOnClickListener(this);
        clubfactory.setOnClickListener(this);
        medium.setOnClickListener(this);

        fb.setOnClickListener(this);
        insta.setOnClickListener(this);
        twitter.setOnClickListener(this);
        quora.setOnClickListener(this);
        tiktok.setOnClickListener(this);

        youtube.setOnClickListener(this);
        zomato.setOnClickListener(this);
        swiggy.setOnClickListener(this);
        reddit.setOnClickListener(this);
        illuminati.setOnClickListener(this);

        pinterest.setOnClickListener(this);
        ola.setOnClickListener(this);
        olx.setOnClickListener(this);
        imdb.setOnClickListener(this);
        byju.setOnClickListener(this);

        udemy.setOnClickListener(this);
        uber.setOnClickListener(this);
        mmt.setOnClickListener(this);
        khan.setOnClickListener(this);
        unacdemy.setOnClickListener(this);

        netflix.setOnClickListener(this);
        oyo.setOnClickListener(this);
        courseera.setOnClickListener(this);
        hackerrank.setOnClickListener(this);
        linkedin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.amazonButtonID:
                Intent i1 = new Intent(MainActivity.this,WebviewActivity.class);
                i1.putExtra("app",1);
                startActivity(i1);
                break;
            case R.id.flipkartButtonID:
                Intent i2 = new Intent(MainActivity.this,WebviewActivity.class);
                i2.putExtra("app",2);
                startActivity(i2);
                break;
            case R.id.snapdealButtonID:
                Intent i3 = new Intent(MainActivity.this,WebviewActivity.class);
                i3.putExtra("app",3);
                startActivity(i3);
                break;
            case R.id.clubfactoryButtonID:
                Intent i4 = new Intent(MainActivity.this,WebviewActivity.class);
                i4.putExtra("app",4);
                startActivity(i4);
                break;
            case R.id.mediumButtonID:
                Intent i5 = new Intent(MainActivity.this,WebviewActivity.class);
                i5.putExtra("app",5);
                startActivity(i5);
                break;
            case R.id.facebookButtonID:
                Intent i6 = new Intent(MainActivity.this,WebviewActivity.class);
                i6.putExtra("app",6);
                startActivity(i6);
                break;
            case R.id.instaButtonID:
                Intent i7 = new Intent(MainActivity.this,WebviewActivity.class);
                i7.putExtra("app",7);
                startActivity(i7);
                break;
           case R.id.twitterButtonID:
                Intent i8 = new Intent(MainActivity.this,WebviewActivity.class);
                i8.putExtra("app",8);
                startActivity(i8);
                break;
            case R.id.quoraID:
                Intent i9 = new Intent(MainActivity.this,WebviewActivity.class);
                i9.putExtra("app",9);
                startActivity(i9);
                break;
            case R.id.tiktokID:
                Intent i10 = new Intent(MainActivity.this,WebviewActivity.class);
                i10.putExtra("app",10);
                startActivity(i10);
                break;
            case R.id.youtubeButtonID:
                Intent i11 = new Intent(MainActivity.this,WebviewActivity.class);
                i11.putExtra("app",11);
                startActivity(i11);
                break;
            case R.id.zomatoButtonID:
                Intent i12 = new Intent(MainActivity.this,WebviewActivity.class);
                i12.putExtra("app",12);
                startActivity(i12);
                break;
            case R.id.swiggyButtonID:
                Intent i13 = new Intent(MainActivity.this,WebviewActivity.class);
                i13.putExtra("app",13);
                startActivity(i13);
                break;
            case R.id.redditButtonID:
                Intent i14 = new Intent(MainActivity.this,WebviewActivity.class);
                i14.putExtra("app",14);
                startActivity(i14);
                break;
            case R.id.illuminatiID:
                Intent i15 = new Intent(MainActivity.this,WebviewActivity.class);
                i15.putExtra("app",15);
                startActivity(i15);
                break;
            case R.id.pinterestButtonID:
                Intent i16 = new Intent(MainActivity.this,WebviewActivity.class);
                i16.putExtra("app",16);
                startActivity(i16);
                break;
            case R.id.olaID:
                Intent i17 = new Intent(MainActivity.this,WebviewActivity.class);
                i17.putExtra("app",17);
                startActivity(i17);
                break;
            case R.id.olxID:
                Intent i18 = new Intent(MainActivity.this,WebviewActivity.class);
                i18.putExtra("app",18);
                startActivity(i18);
                break;
            case R.id.imdbButtonID:
                Intent i19 = new Intent(MainActivity.this,WebviewActivity.class);
                i19.putExtra("app",19);
                startActivity(i19);
                break;
            case R.id.byjuID:
                Intent i20 = new Intent(MainActivity.this,WebviewActivity.class);
                i20.putExtra("app",20);
                startActivity(i20);
                break;
            case R.id.udemyID:
                Intent i21 = new Intent(MainActivity.this,WebviewActivity.class);
                i21.putExtra("app",21);
                startActivity(i21);
                break;
            case R.id.uberID:
                Intent i22 = new Intent(MainActivity.this,WebviewActivity.class);
                i22.putExtra("app",22);
                startActivity(i22);
                break;
            case R.id.makemytripID:
                Intent i23 = new Intent(MainActivity.this,WebviewActivity.class);
                i23.putExtra("app",23);
                startActivity(i23);
                break;
            case R.id.khanacademyID:
                Intent i24 = new Intent(MainActivity.this,WebviewActivity.class);
                i24.putExtra("app",24);
                startActivity(i24);
                break;
            case R.id.unacdemyID:
                Intent i25 = new Intent(MainActivity.this,WebviewActivity.class);
                i25.putExtra("app",25);
                startActivity(i25);
                break;
            case R.id.netflixButtonID:
                Intent i26 = new Intent(MainActivity.this,WebviewActivity.class);
                i26.putExtra("app",26);
                startActivity(i26);
                break;
            case R.id.oyoID:
                Intent i27 = new Intent(MainActivity.this,WebviewActivity.class);
                i27.putExtra("app",27);
                startActivity(i27);
                break;
            case R.id.courseeraID:
                Intent i28 = new Intent(MainActivity.this,WebviewActivity.class);
                i28.putExtra("app",28);
                startActivity(i28);
                break;
            case R.id.hackerrankID:
                Intent i29 = new Intent(MainActivity.this,WebviewActivity.class);
                i29.putExtra("app",29);
                startActivity(i29);
                break;
            case R.id.linkedinButtonID:
                Intent i30 = new Intent(MainActivity.this,WebviewActivity.class);
                i30.putExtra("app",30);
                startActivity(i30);
                break;
        }
    }
}
