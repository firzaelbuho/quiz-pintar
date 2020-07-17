package com.proximastudio.quizpintar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class nilai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);
        Intent intent = getIntent();
        int i = intent.getIntExtra("nilai", 0);
        int cek = intent.getIntExtra("cek",0);
        int nilai=i*10;
        //if(cek==1){
         //   nilai*=2;}

    TextView nilaiku = (TextView) findViewById(R.id.nilai);
    nilaiku.setText(""+nilai);



    }

    public void kembali(View view) {
        klik();
        Intent intent=new Intent(nilai.this,main.class);
        startActivity(intent);
    }
    public void klik(){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.klik);
        mp.start();
    }
}
