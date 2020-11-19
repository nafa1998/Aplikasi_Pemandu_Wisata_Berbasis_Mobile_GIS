package com.example.kp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pelajari extends AppCompatActivity {

    ListView list;
    String mTitle[] = {"Pemerahan Nira (Extraction)","Pemurnian Nira","Penguapan Nira","Kristalisasi","Puteran Gula (Centrifugal)","Gudang Gula"};
    String mKeterangan[] = {"Pelajari Lebih Lanjut","Pelajari Lebih Lanjut","Pelajari Lebih Lanjut","Pelajari Lebih Lanjut","Pelajari Lebih Lanjut","Pelajari Lebih Lanjut"};
    int images[] = {R.drawable.step1, R.drawable.step2, R.drawable.step3, R.drawable.step4, R.drawable.step5, R.drawable.step6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelajari);

        list = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(  this, mTitle, mKeterangan, images);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(pelajari.this, Step1.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(pelajari.this, step2.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(pelajari.this, step3.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(pelajari.this, step4.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(pelajari.this, step5.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(pelajari.this, step6.class);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rKeterangan[];
        int rImgs[];

        MyAdapter (Context c, String title[], String keterangan[], int imgs[]) {
            super(c, R.layout.item, title);
            this.context = c;
            this.rTitle = title;
            this.rKeterangan = keterangan;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View item = layoutInflater.inflate(R.layout.item, parent, false);
            ImageView images = item.findViewById(R.id.image);
            TextView  myTitle = item.findViewById(R.id.textView1);
            TextView myKeterangan = item.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myKeterangan.setText(rKeterangan[position]);

            return item;

        }
    }
}
