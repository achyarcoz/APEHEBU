package com.aljakarti.achyar.apehebu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/**
 * Created by achyar on 3/12/2017.
 */

public class BuahNanas extends AppCompatActivity {

    Button  b_prev,b_next ;
    ImageView indo,inggris,arab;

    ImageSwitcher imageSwitcher;

    Integer[] images = {R.drawable.nanas0, R.drawable.nanas1, R.drawable.nanasindo, R.drawable.nanasinggris, R.drawable.nanasarab};

    int i = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(
                        new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
                return imageView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        Animation out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);

        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);

        imageSwitcher.setImageResource(R.drawable.nanas0);

        b_prev = (Button) findViewById(R.id.b_prev);
        b_next = (Button) findViewById(R.id.b_next);

        b_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i > 0){
                    i--;
                    imageSwitcher.setImageResource(images[i]);
                }
            }
        });

        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i < images.length - 1){
                    i++;
                    imageSwitcher.setImageResource(images[i]);
                }
            }
        });

        indo = (ImageView) findViewById(R.id.indo);
        inggris = (ImageView) findViewById(R.id.inggris);
        arab = (ImageView) findViewById(R.id.arab);

        indo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(BuahNanas.this, R.raw.nanas_indo);
                mp.start();
                imageSwitcher.setImageResource(R.drawable.nanasindo);
            }
        });

        inggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(BuahNanas.this, R.raw.nanas_inggris);
                mp.start();
                imageSwitcher.setImageResource(R.drawable.nanasinggris);
            }
        });

        arab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(BuahNanas.this, R.raw.nanas_arab);
                mp.start();
                imageSwitcher.setImageResource(R.drawable.nanasarab);
            }
        });

        //String htmlText = " %s ";
        String myData = "Buah yang sudah tua ditandai dengan kulit yang mengkilap dan biji terdengar kocak saat dikocok-kocok, " +
                "dan daging alpukat sangat mudah dikerok apabila sudah matang.\n" +
                "Alpukat memmiliki tekstur halus tak berserat, berwarna kuning mudahingga kuning mentega (disebut mentega hijau alami) ." +
                "rasa daging alpukat gurih dan tidak manis. Jika sudah matang.\n" +
                "Alpukat berasal dari Amerika Tengah. Penyebarannya keluar Amerika dilakukan oleh penjajah Spanyol. " +
                "Kini alpukat telah menyebar di negara-negara  tropis dan subtropics termasuk Indonesia.\n" +
                "Sari buah alpukat ditambahkan susu dan disajikan dingin pad siang hari, siapa yang tidak menyukainya?\n" +
                "Selain mengandung banyak vitamin A, C, E, berbagai mineral, serta protein yang tidak biasaterdapat dalam buah. " +
                "masih banyak lagi manfaat dan khasiat Alpukat terutaman untuk kecantikan.\n" +
                "Zat-zat nutrisi tersebut berguna bagi keindahan dan kesehatan kulit, yaitu sebagai pelembap.";

        TextView ket = (TextView) findViewById(R.id.keterangan);
        ket.setText(""+myData);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
