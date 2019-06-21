package com.mitra.buah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //membuat log dengan logt
    private static final String TAG = "DetailActivity";

    TextView tv_namabuah;
    ImageView iv_gambarbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarbuah = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);

        //cara logging
        Log.d(TAG, "nama: namabuah");
        Log.d(TAG, "gambar: gambarbuah");

        tv_namabuah = findViewById(R.id.tv_detail_nama);
        iv_gambarbuah = findViewById(R.id.iv_detail_gambar);

        tv_namabuah.setText(namabuah);
        iv_gambarbuah.setImageResource(gambarbuah);
    }
}
