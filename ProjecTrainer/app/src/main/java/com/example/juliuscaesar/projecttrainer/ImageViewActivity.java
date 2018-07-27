package com.example.juliuscaesar.projecttrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        mImageView = findViewById(R.id.iv_1);
        Glide.with(this).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(mImageView);
    }
}
