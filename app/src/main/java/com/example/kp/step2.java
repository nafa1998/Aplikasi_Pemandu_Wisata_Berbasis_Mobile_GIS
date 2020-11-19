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

public class step2 extends AppCompatActivity {
    private int[] mImages = new int[] {
            R.drawable.pemurnian1, R.drawable.pemurnian2, R.drawable.pemurnian3, R.drawable.pemurnian4
    };

    private String[] mImagesTitle = new String[] {
            "Gambar 1", "Gambar 2", "Gambar 3", "Gambar 4",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

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
                Toast.makeText(step2.this, mImagesTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void kembali(View view) {
        Intent intent = new Intent(step2.this, pelajari.class);
        startActivity(intent);
    }
    public void beranda(View view) {
        Intent intent = new Intent(step2.this, MainActivity.class);
        startActivity(intent);
    }
    public void lokasi(View view) {
        Intent intent = new Intent(step2.this, LokPemurnian.class);
        startActivity(intent);
    }
}
