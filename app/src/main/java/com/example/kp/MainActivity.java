package com.example.kp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView keluar;
    ImageView rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keluar = findViewById(R.id.keluar);
        rate = findViewById(R.id.rate);

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , Login.class));
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , rate.class));
            }
        });

    }


    public void tentang(View view) {
        Intent intent = new Intent(MainActivity.this, TentangMadubaru.class);
        startActivity(intent);
    }

    public void lokasi(View view) {
        Intent intent = new Intent(MainActivity.this, tempat.class);
        startActivity(intent);
    }

    public void sejarah(View view) {
        Intent intent = new Intent(MainActivity.this, Sejarah.class);
        startActivity(intent);
    }

    public void pelajari(View view) {
        Intent intent = new Intent(MainActivity.this, pelajari.class);
        startActivity(intent);
    }


}
