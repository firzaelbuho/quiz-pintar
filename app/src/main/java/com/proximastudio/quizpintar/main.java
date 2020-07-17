package com.proximastudio.quizpintar;

import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class main extends AppCompatActivity {

    protected Cursor cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set bg button

        AdView adView = (AdView) findViewById(R.id.spanduk);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


    }

    public void challenge(View view) {
        klik();
        Intent intent=new Intent(main.this, challenge.class);
        startActivity(intent);
    }


    public void mulai(View view) {
        klik();
        Intent intent=new Intent(main.this,kategori.class);
        startActivity(intent);
    }

    public void about(View view) {
        klik();
        Intent intent=new Intent(main.this,about.class);
        startActivity(intent);
    }


    public void klik(){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.klik);
        mp.start();
    }
}
