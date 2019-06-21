package com.mitra.buah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;

    public CustomListAdapter(Context context1, String[] namabuah, int[] gambarbuah) {
        super(context1, R.layout.itembuah, namabuah);
        this.context = context1;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Atur layout item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.itembuah, parent, false);
        //findviewbyid untuk setiap komponen dalam item
        TextView tv_namabuah = view.findViewById(R.id.tv_item_nama);
        ImageView iv_gambarbuah = view.findViewById(R.id.iv_item_gambar);
        //set data
        tv_namabuah.setText(namabuah[position]);
        iv_gambarbuah.setImageResource(gambarbuah[position]);
        return view;
    }
}
