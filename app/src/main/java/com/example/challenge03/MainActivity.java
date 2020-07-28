package com.example.challenge03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    ImageView imageView;
    ImageView imageView2;
    HorizontalScrollView horizontalScrollView;
    BitmapDrawable bitmap;
    BitmapDrawable bitmap2;

    int imageIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        horizontalScrollView = findViewById(R.id.horScrollView);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.digi01);
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.poke01);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmap2Width = bitmap2.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        int bitmap2Height = bitmap2.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;

        imageView2.setImageDrawable(bitmap2);
        imageView2.getLayoutParams().width = bitmap2Width;
        imageView2.getLayoutParams().height = bitmap2Height;



    }

    public void onBtn1Clicked(View v){

        changeImage();
    }

    private void changeImage(){
        if(imageIndex == 0){

            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.digi01);
            bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.poke01);

            int bitmapWidth = bitmap.getIntrinsicWidth();
            int bitmap2Width = bitmap2.getIntrinsicWidth();
            int bitmapHeight = bitmap.getIntrinsicHeight();
            int bitmap2Height = bitmap2.getIntrinsicHeight();

            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitmapWidth;
            imageView.getLayoutParams().height = bitmapHeight;

            imageView2.setImageDrawable(bitmap2);
            imageView2.getLayoutParams().width = bitmap2Width;
            imageView2.getLayoutParams().height = bitmap2Height;

            imageIndex = 1;


        }else if(imageIndex == 1){

            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.poke01);
            bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.digi01);

            int bitmapWidth = bitmap.getIntrinsicWidth();
            int bitmap2Width = bitmap2.getIntrinsicWidth();
            int bitmapHeight = bitmap.getIntrinsicHeight();
            int bitmap2Height = bitmap2.getIntrinsicHeight();

            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitmapWidth;
            imageView.getLayoutParams().height = bitmapHeight;

            imageView2.setImageDrawable(bitmap2);
            imageView2.getLayoutParams().width = bitmap2Width;
            imageView2.getLayoutParams().height = bitmap2Height;

            imageIndex = 0;
        }

    }
}