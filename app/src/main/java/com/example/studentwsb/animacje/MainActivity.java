package com.example.studentwsb.animacje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean zmiana = true;
    public void fade(View view){

        ImageView image = findViewById(R.id.imageimageView);
        ImageView image1 = findViewById(R.id.image1imageView);

        if(zmiana) {
            image.animate().alpha(0).setDuration(2000);
            image1.animate().alpha(1).setDuration(2000);
            zmiana = false;
        }else {
            image.animate().alpha(1).setDuration(2000);
            image1.animate().alpha(0).setDuration(2000);
            zmiana = true;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
