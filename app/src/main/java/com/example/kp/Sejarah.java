package com.example.kp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sejarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);
    }

    public void home(View view) {
        Intent intent = new Intent(Sejarah.this, MainActivity.class);
        startActivity(intent);
    }
}
