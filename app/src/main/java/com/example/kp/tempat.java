package com.example.kp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class tempat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat);

    }

    public void alamat(View view) {
        Intent intent = new Intent(tempat.this, alamat.class);
        startActivity(intent);
    }

    public void produksi(View view) {
        Intent intent = new Intent(tempat.this, LokAlatProduksi.class);
        startActivity(intent);
    }
}
