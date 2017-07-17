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

public class LayerHewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_hewan);
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
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        Intent ayam = new Intent(getApplication(),HewanAyam.class);
                        startActivity(ayam);

                        MediaPlayer mpayam = MediaPlayer.create(LayerHewan.this, R.raw.ayam_indo);
                        mpayam.start();
                        break;
                    case 1 :
                        Intent bebek = new Intent(getApplication(),HewanBebek.class);
                        startActivity(bebek);

                        MediaPlayer mpbebek = MediaPlayer.create(LayerHewan.this, R.raw.bebek_indo);
                        mpbebek.start();
                        break;
                    case 2 :
                        Intent beruang = new Intent(getApplication(),HewanBeruang.class);
                        startActivity(beruang);

                        MediaPlayer mpberuang = MediaPlayer.create(LayerHewan.this, R.raw.beruang_indo);
                        mpberuang.start();
                        break;
                    case 3 :
                        Intent burunghantu = new Intent(getApplication(),HewanBurungHantu.class);
                        startActivity(burunghantu);

                        MediaPlayer mpburunghantu = MediaPlayer.create(LayerHewan.this, R.raw.burunghantu_indo);
                        mpburunghantu.start();
                        break;
                    case 4 :
                        Intent harimau = new Intent(getApplication(),HewanHarimau.class);
                        startActivity(harimau);

                        MediaPlayer mpharimau = MediaPlayer.create(LayerHewan.this, R.raw.harimau_indo);
                        mpharimau.start();
                        break;
                    case 5 :
                        Intent ikan = new Intent(getApplication(),HewanIkan.class);
                        startActivity(ikan);

                        MediaPlayer mpikan = MediaPlayer.create(LayerHewan.this, R.raw.ikan_indo);
                        mpikan.start();
                        break;
                    case 6 :
                        Intent kambing = new Intent(getApplication(),HewanKambing.class);
                        startActivity(kambing);

                        MediaPlayer mpkambing = MediaPlayer.create(LayerHewan.this, R.raw.kambing_indo);
                        mpkambing.start();
                        break;
                    case 7 :
                        Intent kera = new Intent(getApplication(),HewanKera.class);
                        startActivity(kera);

                        MediaPlayer mpkera = MediaPlayer.create(LayerHewan.this, R.raw.kera_indo);
                        mpkera.start();
                        break;
                    case 8 :
                        Intent kurakura = new Intent(getApplication(),HewanKuraKura.class);
                        startActivity(kurakura);

                        MediaPlayer mpkurakura = MediaPlayer.create(LayerHewan.this, R.raw.kurakura_indo);
                        mpkurakura.start();
                        break;
                    case 9 :
                        Intent rusa = new Intent(getApplication(),HewanRusa.class);
                        startActivity(rusa);

                        MediaPlayer mprusa = MediaPlayer.create(LayerHewan.this, R.raw.rusa_indo);
                        mprusa.start();
                        break;
                    case 10 :
                        Intent sapi = new Intent(getApplication(),HewanSapi.class);
                        startActivity(sapi);

                        MediaPlayer mpsapi = MediaPlayer.create(LayerHewan.this, R.raw.sapi_indo);
                        mpsapi.start();
                        break;
                    case 11 :
                        Intent ular = new Intent(getApplication(),HewanUlar.class);
                        startActivity(ular);

                        MediaPlayer mpular = MediaPlayer.create(LayerHewan.this, R.raw.ular_indo);
                        mpular.start();
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

    public class ImageAdapter extends BaseAdapter{
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
                R.drawable.hewan_0,
                R.drawable.hewan_1,
                R.drawable.hewan_2,
                R.drawable.hewan_9,
                R.drawable.hewan_4,
                R.drawable.hewan_5,
                R.drawable.hewan_6,
                R.drawable.hewan_8,
                R.drawable.hewan_7,
                R.drawable.hewan_10,
                R.drawable.hewan_11,
                R.drawable.hewan_12,
        };
    }
}
