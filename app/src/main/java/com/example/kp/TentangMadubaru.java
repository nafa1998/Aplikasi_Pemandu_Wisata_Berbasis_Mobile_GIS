package com.example.kp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TentangMadubaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_madubaru);
    }

    public void back(View view) {
        Intent intent = new Intent(TentangMadubaru.this, MainActivity.class);
        startActivity(intent);
    }

}