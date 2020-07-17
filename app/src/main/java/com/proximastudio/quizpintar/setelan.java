package com.proximastudio.quizpintar;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class setelan extends AppCompatActivity {
    public int counter;
    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setelan);


        btn = (Button) findViewById(R.id.lanjut);
        text = (TextView) findViewById(R.id.nilai);

        new CountDownTimer(50000000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                text.setText(String.valueOf(counter));
                counter++;
            }
            @Override
            public void onFinish() {
                text.setText("Finished");
            }
        }.start();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btn = new Intent(setelan.this, main.class);
                startActivity(btn);

            }
        });

    }


}
