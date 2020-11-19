package com.example.kp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class alamat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamat);
    }
    public void gmaps(View view) {
        Intent intent = new Intent(alamat.this, lokasi.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(alamat.this, MainActivity.class);
        startActivity(intent);
    }
}
