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

public class GameOver extends AppCompatActivity {
    TextView gameStatusTV, mesTV;
    String message;
    Button playAgnBtn, quitBtn;
    Animation topAnim, bottomAnim;
    ImageView hangmanIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        gameStatusTV = findViewById(R.id.gameStatusTV);
        playAgnBtn = findViewById(R.id.playAgnBtn);
        quitBtn = findViewById(R.id.quitBtn);
        mesTV = findViewById(R.id.mesTV);
        hangmanIV = findViewById(R.id.hangmanIV);

        if(getIntent().hasExtra("message")){
            message = getIntent().getExtras().getString("message");
        }
        mesTV.setText("The word was " + message);
        String gameStatus ="";
        if(getIntent().hasExtra("gameStatus")){
            gameStatus = getIntent().getExtras().getString("gameStatus");
        }

        if(gameStatus.equals("won")){
            gameStatusTV.setText("Congrats!");
            gameStatusTV.append("\nYou won!");
        }
        if(gameStatus.equals("lost")){
            gameStatusTV.setText("Game Over");
            gameStatusTV.append("\nYou lost!");

        }
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_amination);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        hangmanIV.setAnimation(topAnim);
        gameStatusTV.setAnimation(topAnim);
        mesTV.setAnimation(bottomAnim);
        playAgnBtn.setAnimation(bottomAnim);
        quitBtn.setAnimation(bottomAnim);
        playAgnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backMain = new Intent(GameOver.this, GameActivity.class);
                startActivity(backMain);
            }
        });
        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backMain = new Intent(GameOver.this, MainActivity.class);
                startActivity(backMain);
            }
        });

    }
}
