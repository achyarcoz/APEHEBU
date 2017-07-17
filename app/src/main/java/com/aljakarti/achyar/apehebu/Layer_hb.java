package com.aljakarti.achyar.apehebu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Layer_hb extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_hb);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        ImageView hewan = (ImageView) findViewById(R.id.hewan);
        hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent h = new Intent(getApplication(),LayerHewan.class);
                startActivity(h);

                MediaPlayer mp = MediaPlayer.create(Layer_hb.this, R.raw.belajarhewan);
                mp.start();
            }
        });

        ImageView buah = (ImageView) findViewById(R.id.buah);
        buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplication(),LayerBuah.class);
                startActivity(b);

                MediaPlayer mp = MediaPlayer.create(Layer_hb.this, R.raw.belajarbuah);
                mp.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(doubleBackToExitPressedOnce) {
            super.onBackPressed();
            moveTaskToBack(true);
            return;
        }
        this.doubleBackToExitPressedOnce = true ;
        Toast.makeText(this,"Tekan Sekali Lagi Untuk Keluar",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
