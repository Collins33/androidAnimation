package com.example.root.animationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    public void fade(View view){
        //get the view
        //ImageView batMan=(ImageView) findViewById(R.id.imageView);
        ImageView superman=(ImageView) findViewById(R.id.imageView2);
        //batMan.animate().rotation(180f).setDuration(8000);
        superman.animate().rotation(180f).scaleX(0.5f).scaleY(0.5f).setDuration(900);

    }*/

    public void fadeOut(View view){
        //get view
        ImageView superman=(ImageView) findViewById(R.id.imageView2);
        //animate the view
        superman.animate().alpha(0.5f).setDuration(5000);

    }
    public void fadeIn(View view){
        ImageView superman=(ImageView) findViewById(R.id.imageView2);
        superman.animate().alpha(1).setDuration(5000);
    }


}
