package com.aljakarti.achyar.apehebu;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class LayerBuah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_buah);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new LayerBuah.ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent alpukat = new Intent(getApplication(),BuahAlpukat.class);
                        startActivity(alpukat);

                        MediaPlayer mpalpukat = MediaPlayer.create(LayerBuah.this, R.raw.alpukat_indo);
                        mpalpukat.start();
                        break;
                    case 1:
                        Intent anggur = new Intent(getApplication(),BuahAnggur.class);
                        startActivity(anggur);

                        MediaPlayer mpanggur = MediaPlayer.create(LayerBuah.this, R.raw.anggur_indo);
                        mpanggur.start();
                        break;
                    case 2:
                        Intent apel = new Intent(getApplication(),BuahApel.class);
                        startActivity(apel);

                        MediaPlayer mpapel = MediaPlayer.create(LayerBuah.this, R.raw.apel_indo);
                        mpapel.start();
                        break;
                    case 3:
                        Intent cherry = new Intent(getApplication(),BuahCherry.class);
                        startActivity(cherry);

                        MediaPlayer mpcherry = MediaPlayer.create(LayerBuah.this, R.raw.cherry_indo);
                        mpcherry.start();
                        break;
                    case 4:
                        Intent durian = new Intent(getApplication(),BuahDurian.class);
                        startActivity(durian);

                        MediaPlayer mpdurian = MediaPlayer.create(LayerBuah.this, R.raw.durian_indo);
                        mpdurian.start();
                        break;
                    case 5:
                        Intent jambubiji = new Intent(getApplication(),BuahJambuBiji.class);
                        startActivity(jambubiji);

                        MediaPlayer mpjambubiji = MediaPlayer.create(LayerBuah.this, R.raw.jambubiji_indo);
                        mpjambubiji.start();
                        break;
                    case 6:
                        Intent jambumete = new Intent(getApplication(),BuahJambuMete.class);
                        startActivity(jambumete);

                        MediaPlayer mpjambumete = MediaPlayer.create(LayerBuah.this, R.raw.jambumete_indo);
                        mpjambumete.start();
                        break;
                    case 7:
                        Intent jeruk = new Intent(getApplication(),BuahJeruk.class);
                        startActivity(jeruk);

                        MediaPlayer mpjeruk = MediaPlayer.create(LayerBuah.this, R.raw.jeruk_indo);
                        mpjeruk.start();
                        break;
                    case 8:
                        Intent mangga = new Intent(getApplication(),BuahMangga.class);
                        startActivity(mangga);

                        MediaPlayer mpmangga = MediaPlayer.create(LayerBuah.this, R.raw.mangga_indo);
                        mpmangga.start();
                        break;
                    case 9:
                        Intent manggis = new Intent(getApplication(),BuahManggis.class);
                        startActivity(manggis);

                        MediaPlayer mpmanggis = MediaPlayer.create(LayerBuah.this, R.raw.manggis_indo);
                        mpmanggis.start();
                        break;
                    case 10:
                        Intent nanas = new Intent(getApplication(),BuahNanas.class);
                        startActivity(nanas);

                        MediaPlayer mpnanas = MediaPlayer.create(LayerBuah.this, R.raw.nanas_indo);
                        mpnanas.start();
                        break;
                    case 11:
                        Intent pisang = new Intent(getApplication(),BuahPisang.class);
                        startActivity(pisang);

                        MediaPlayer mppisang = MediaPlayer.create(LayerBuah.this, R.raw.pisang_indo);
                        mppisang.start();
                        break;
                    case 12:
                        Intent semangka = new Intent(getApplication(),BuahSemangka.class);
                        startActivity(semangka);

                        MediaPlayer mpsemangka = MediaPlayer.create(LayerBuah.this, R.raw.semangka_indo);
                        mpsemangka.start();
                        break;
                    case 13:
                        Intent strawberry = new Intent(getApplication(),BuahStrawberry.class);
                        startActivity(strawberry);

                        MediaPlayer mpstrawberry = MediaPlayer.create(LayerBuah.this, R.raw.strawberry_indo);
                        mpstrawberry.start();
                        break;
                }
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c){
            mContext = c;
        }

        public int getCount(){
            return mThumbIds.length;
        }

        public Object getItem(int position){
            return null;
        }

        public long getItemId(int position){
            return 0;
        }

        public View getView (int position, View convertView, ViewGroup parent){
            ImageView imageView = new ImageView(mContext);

            imageView.setLayoutParams(new GridView.LayoutParams(250,270));
            //imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(8,2,8,2);
            imageView.setImageResource(mThumbIds[position]);
            return  imageView;
        }

        private Integer[] mThumbIds = {
                R.drawable.buah_0,
                R.drawable.buah_2,
                R.drawable.buah_4,
                R.drawable.buah_5,
                R.drawable.buah_6,
                R.drawable.buah_3,
                R.drawable.buah_7,
                R.drawable.buah_1,
                R.drawable.buah_8,
                R.drawable.buah_9,
                R.drawable.buah_10,
                R.drawable.buah_11,
                R.drawable.buah_12,
                R.drawable.buah_13
        };
    }
}
