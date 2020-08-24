package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
        Button playBtn;
        Animation topAnim, bottomAnim;
        ImageView hangmanIV;
        TextView titleTV;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            playBtn = findViewById(R.id.playBtn);
            hangmanIV = findViewById(R.id.hangmanIV);
            titleTV = findViewById(R.id.gameStatusTV);

            topAnim = AnimationUtils.loadAnimation(this, R.anim.top_amination);
            bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
            hangmanIV.setAnimation(topAnim);
            titleTV.setAnimation(topAnim);
            playBtn.setAnimation(bottomAnim);

            playBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent toGame = new Intent(MainActivity.this, GameActivity.class);
                    startActivity(toGame);
                }
            });
        }


    }




