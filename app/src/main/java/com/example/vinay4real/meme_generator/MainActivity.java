package com.example.vinay4real.meme_generator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment=(BottomPictureFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top,bottom);
    }





}
