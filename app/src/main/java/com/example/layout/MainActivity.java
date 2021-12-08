package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void tom(View view){

        ImageView imageViewTom = (ImageView) findViewById(R.id.imageViewTom);
        //ImageView imageViewDore = (ImageView) findViewById(R.id.imageViewDore);

        imageViewTom.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //imageViewDore.animate().alpha(1f).setDuration(2000);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewTom = (ImageView) findViewById(R.id.imageViewTom);
        imageViewTom.setTranslationX(-4000f);
    }
}