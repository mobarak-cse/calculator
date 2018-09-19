package com.motheriloveyou.butterfly.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class ImageCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_circle);

        CircleImageView circleImageView = findViewById(R.id.profile_image);

    }
}
