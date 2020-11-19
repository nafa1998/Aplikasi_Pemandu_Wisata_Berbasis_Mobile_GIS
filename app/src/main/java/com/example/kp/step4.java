package com.example.kp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class step4 extends AppCompatActivity {
    private int[] mImages = new int[] {
            R.drawable.kristalisasi1, R.drawable.kristalisasi2, R.drawable.kristalisasi3, R.drawable.kristalisasi4
    };

    private String[] mImagesTitle = new String[] {
            "Gambar 1", "Gambar 2", "Gambar 3", "Gambar 4",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);

            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(step4.this, mImagesTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void kembali(View view) {
        Intent intent = new Intent(step4.this, pelajari.class);
        startActivity(intent);
    }
    public void beranda(View view) {
        Intent intent = new Intent(step4.this, MainActivity.class);
        startActivity(intent);
    }
    public void lokasi(View view) {
        Intent intent = new Intent(step4.this, LokKristalisasi.class);
        startActivity(intent);
    }
}