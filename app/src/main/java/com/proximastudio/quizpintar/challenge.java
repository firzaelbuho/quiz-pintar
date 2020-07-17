package com.proximastudio.quizpintar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;


public class challenge extends AppCompatActivity {



    ToggleButton togglebutton;
    Button button;


    protected Cursor cursor;
    private final long startTime = 10 * 1000;
    private final long interval = 1 * 1000;
    DBSystem dbHelper;
    int i=0;
    //untuk parameter soal dijawab/tdk
    int j;
    int count=0;
    int idx=1;
    int idx0=0;
    int counter=10;
    int kalah=0;
    String key;
    int[] no_soal;
    Button a,b,c,d,e,lanjut;
    boolean timestarted=true;
    private InterstitialAd mInterstitialAd;






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7962438254208619/7492594321");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());







        //isi nilai array
        no_soal = new int[120];
        for(int k=0;k<120;k++){
            no_soal[k]=k+1;
        }

        // loop through the result set

        shuffleArray(no_soal);
        idx=no_soal[i];

        //panggil fungsi tampilkan kuis
        kuis(idx);


    }




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)







    //fungsi buat kuis pertanyaan
    public void kuis(int x) {




        button = (Button)findViewById(R.id.lanjut);
        button.setEnabled(false);
        button.setBackground(getResources().getDrawable(R.drawable.button_bg0));





        int no=i+1;

        Intent intent = getIntent();
        String kategori = intent.getStringExtra("cat");

        setContentView(R.layout.activity_challenge);
        dbHelper = new DBSystem(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();


        TextView textView = (TextView) findViewById(R.id.soal);
        TextView nomor = (TextView) findViewById(R.id.nomor) ;
        nomor.setText("" + no);

        //iklan




        AdView adView;
        adView = (AdView) findViewById(R.id.spanduk);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        Button texta = (Button) findViewById(R.id.a);
        Button textb = (Button) findViewById(R.id.b);
        Button textc = (Button) findViewById(R.id.c);
        Button textd = (Button) findViewById(R.id.d);
        Button texte = (Button) findViewById(R.id.e);



        cursor = db.rawQuery("SELECT * FROM soal where id='"+x+"'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            textView.setText(cursor.getString(2).toString());
            texta.setText(cursor.getString(3).toString());
            textb.setText(cursor.getString(4).toString());
            textc.setText(cursor.getString(5).toString());
            textd.setText(cursor.getString(6).toString());
            texte.setText(cursor.getString(7).toString());

        }


        counter=15;
        timestarted=true;
        final TextView texttimer = (TextView) findViewById(R.id.timer);




        final CountDownTimer ctd = new CountDownTimer(16000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                texttimer.setText(String.valueOf(counter));

                counter--;

            }

            @Override
            public void onFinish() {

                texttimer.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
                salah();
                klikbt();
                kalah=1;
                texttimer.setText("Waktu Habis");
                i++;
            }
        }.start();





        Button btna=(Button) findViewById(R.id.a);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctd.cancel();


                klikbt();
                Intent intent = getIntent();
                String kategori = intent.getStringExtra("cat");
                int idx1=no_soal[i];

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM soal where id='"+idx1+"'",null);
                cursor.moveToFirst();
                if (cursor.getCount()>0)
                {
                    cursor.moveToPosition(0);
                    key=cursor.getString(8).toString();


                }

                //jika jawaban benar
                if(key.equals("a")){
                    count+=1;
                    //suara tintnong
                    benar();
                    a.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
                    TextView timerstatus = (TextView) findViewById(R.id.timer);
                    timerstatus.setText("✓");
                }
                //jika salah
                else {
                    //suara tetet
                    salah();
                    a.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
                    koreksi(key);
                }



                i++;

            }
        });

        Button btnb=(Button) findViewById(R.id.b);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctd.cancel();
                klikbt();
                Intent intent = getIntent();
                String kategori = intent.getStringExtra("cat");
                int idx1=no_soal[i];

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM soal where id='"+idx1+"'",null);
                cursor.moveToFirst();
                if (cursor.getCount()>0)
                {
                    cursor.moveToPosition(0);
                    key=cursor.getString(8).toString();


                }

                //jika jawaban benar
                if(key.equals("b")){
                    count+=1;
                    //suara tintnong
                    benar();
                    b.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
                    TextView timerstatus = (TextView) findViewById(R.id.timer);
                    timerstatus.setText("✓");
                }
                //jika salah
                else {
                    //suara tetet
                    salah();
                    b.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
                    koreksi(key);
                }



                i++;

            }
        });

        Button btnc=(Button) findViewById(R.id.c);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctd.cancel();
                klikbt();
                Intent intent = getIntent();
                String kategori = intent.getStringExtra("cat");
                int idx1=no_soal[i];

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM soal where id='"+idx1+"'",null);
                cursor.moveToFirst();
                if (cursor.getCount()>0)
                {
                    cursor.moveToPosition(0);
                    key=cursor.getString(8).toString();


                }

                //jika jawaban benar
                if(key.equals("c")){
                    count+=1;
                    //suara tintnong
                    benar();
                    c.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
                    TextView timerstatus = (TextView) findViewById(R.id.timer);
                    timerstatus.setText("✓");
                }
                //jika salah
                else {
                    //suara tetet
                    salah();
                    c.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
                    koreksi(key);
                }



                i++;

            }
        });

        Button btnd=(Button) findViewById(R.id.d);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctd.cancel();
                klikbt();
                Intent intent = getIntent();
                String kategori = intent.getStringExtra("cat");
                int idx1=no_soal[i];

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM soal where id='"+idx1+"'",null);
                cursor.moveToFirst();
                if (cursor.getCount()>0)
                {
                    cursor.moveToPosition(0);
                    key=cursor.getString(8).toString();


                }

                //jika jawaban benar
                if(key.equals("d")){
                    count+=1;
                    //suara tintnong
                    benar();
                    d.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
                    TextView timerstatus = (TextView) findViewById(R.id.timer);
                    timerstatus.setText("✓");
                }
                //jika salah
                else {
                    //suara tetet
                    salah();
                    d.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
                    koreksi(key);
                }



                i++;

            }
        });

        Button btne=(Button) findViewById(R.id.e);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctd.cancel();
                klikbt();
                Intent intent = getIntent();
                String kategori = intent.getStringExtra("cat");
                int idx1=no_soal[i];

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM soal where id='"+idx1+"'",null);
                cursor.moveToFirst();
                if (cursor.getCount()>0)
                {
                    cursor.moveToPosition(0);
                    key=cursor.getString(8).toString();


                }

                //jika jawaban benar
                if(key.equals("e")){
                    count+=1;
                    //suara tintnong
                    benar();
                    e.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
                    TextView timerstatus = (TextView) findViewById(R.id.timer);
                    timerstatus.setText("✓");
                }
                //jika salah
                else {
                    //suara tetet
                    salah();
                    e.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
                    koreksi(key);
                }



                i++;

            }
        });
        Button nextbtn = (Button) findViewById(R.id.lanjut);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i<10 && i==j){
                    //do nothing

                }
                else if (i<120 && kalah==0 && i!=j ){
                    ctd.cancel();
                    klik();
                    idx=no_soal[i];
                    kuis(idx);




                }
                else{


                    klik();
                    ctd.cancel();

                    Intent btn = new Intent(challenge.this, nilai.class);
                    btn.putExtra("nilai",count);
                    btn.putExtra("cek",1);
                    btn.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    setContentView(R.layout.activity_mulai);
                    startActivity(btn);
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }





            }
        });






    }




    //method nomor acak
    static void shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public void benar(){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.benar);
        mp.start();
    }
    public void salah() {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.salah);
        mp.start();
    }
    public void klik() {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.klik);
        mp.start();
    }










    public void klikbt(){

        idx=no_soal[i];

        counter=0;
        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);
        lanjut = (Button) findViewById(R.id.lanjut);


        lanjut.setBackground(getResources().getDrawable(R.drawable.button_bg));
        lanjut.setEnabled(true);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        TextView texttimer = (TextView) findViewById(R.id.timer);
        texttimer.setText("-");
        //texttimer.setBackground(getResources().getDrawable(R.drawable.circle_bg));

    }

    public void koreksi(String key){

        kalah=1;
        TextView timerstatus = (TextView) findViewById(R.id.timer);
        timerstatus.setBackground(getResources().getDrawable(R.drawable.button_bg_false));
        timerstatus.setText("X");
        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);

        //jawaban yg benar
        if(key.equals("a")){
            a.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
        }
        else if(key.equals("b")){
            b.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
        }
        else if(key.equals("c")){
            c.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
        }
        else if(key.equals("d")){
            d.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
        }
        else if(key.equals("e")){
            e.setBackground(getResources().getDrawable(R.drawable.button_bg_true));
        }


    }
}
