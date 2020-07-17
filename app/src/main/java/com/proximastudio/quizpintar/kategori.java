package com.proximastudio.quizpintar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class kategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kategori);
        AdView adView = (AdView) findViewById(R.id.spanduk);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);





    }

    public void umum(View view) {
        klik();
        Intent intent=new Intent(kategori.this,mulai.class);
        intent.putExtra("cat","umum");
        startActivity(intent);
    }

    public void sains(View view) {
        klik();
        Intent intent=new Intent(kategori.this,mulai.class);
        intent.putExtra("cat","sains");
        startActivity(intent);
    }


    public void teknologi(View view) {
        klik();
        Intent intent=new Intent(kategori.this,mulai.class);
        intent.putExtra("cat","tekno");
        startActivity(intent);
    }

    public void hiburan(View view) {
        klik();
        Intent intent=new Intent(kategori.this,mulai.class);
        intent.putExtra("cat","hiburan");
        startActivity(intent);
    }

    public void klik(){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.klik);
        mp.start();
    }
}
