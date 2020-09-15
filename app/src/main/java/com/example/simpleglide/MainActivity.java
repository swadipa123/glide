package com.example.simpleglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);

        String[] urls = {
                "https://cdn.pixabay.com/photo/2020/09/11/17/01/landscape-5563684_960_720.jpg",
                 "https://cdn.pixabay.com/photo/2020/09/11/02/36/flamingo-5561920_960_720.jpg"};

        Glide.with(this).load(urls[0]).into(img1); //urls point to image [0],[1]
        Glide.with(this).load(urls[1]).into(img2);
    }
}