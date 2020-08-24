package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    int numGuesses = 7;
    String printIncorrectLet = "", message, printMes = "";
    ArrayList<String> changePrintMes = new ArrayList<String>();
    boolean lettersGuessed [] = new boolean[26];
    TextView msgTextView, letGuessedTxtView, numGuessTxtView;
    ImageView hangmanImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        msgTextView = (TextView)findViewById(R.id.messageTextView);
        letGuessedTxtView = (TextView)findViewById(R.id.letGuessedTxtView);
        Arrays.fill(lettersGuessed, false);
        hangmanImgView = (ImageView)findViewById(R.id.hangmanImgView);
        setImage(hangmanImgView, getImgId(numGuesses));
        numGuessTxtView = (TextView)findViewById(R.id.numGuessTxtView);
        numGuessTxtView.setText( numGuesses + "");
        letGuessedTxtView.setText(printIncorrectLet);

        String saveWords ="";
        try {
            InputStream inputStream = getAssets().open("messagesTwo.txt");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            while(inputStream.read(buffer)!= -1){
                inputStream.read(buffer);
            }
            saveWords = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String arr [] =  saveWords.split("\n");
        int mesIndex = (int)(Math.random() * arr.length);
        message = arr[mesIndex].substring(0, arr[mesIndex].length()-1);

        hideMes();
        printMes();
        msgTextView.setText(printMes);

        Button aButton = (Button)findViewById(R.id.aButton);
        Button bButton = (Button)findViewById(R.id.bButton);
        Button cButton = (Button)findViewById(R.id.cButton);
        Button dButton = (Button)findViewById(R.id.dButton);
        Button eButton = (Button)findViewById(R.id.eButton);
        Button fButton = (Button)findViewById(R.id.fButton);
        Button gButton = (Button)findViewById(R.id.gButton);
        Button hButton = (Button)findViewById(R.id.hButton);
        Button iButton = (Button)findViewById(R.id.iButton);
        Button jButton = (Button)findViewById(R.id.jButton);
        Button kButton = (Button)findViewById(R.id.kButton);
        Button lButton = (Button)findViewById(R.id.lButton);
        Button mButton = (Button)findViewById(R.id.mButton);
        Button nButton = (Button)findViewById(R.id.nButton);
        Button oButton = (Button)findViewById(R.id.oButton);
        Button pButton = (Button)findViewById(R.id.pButton);
        Button qButton = (Button)findViewById(R.id.qButton);
        Button rButton = (Button)findViewById(R.id.rButton);
        Button sButton = (Button)findViewById(R.id.sButton);
        Button tButton = (Button)findViewById(R.id.tButton);
        Button uButton = (Button)findViewById(R.id.uButton);
        Button vButton = (Button)findViewById(R.id.vButton);
        Button wButton = (Button)findViewById(R.id.wButton);
        Button xButton = (Button)findViewById(R.id.xButton);
        Button yButton = (Button)findViewById(R.id.yButton);
        Button zButton = (Button)findViewById(R.id.zButton);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("a");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("b");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("c");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("d");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("e");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("f");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        gButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("g");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        hButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("h");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        iButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("i");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        jButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("j");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        kButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("k");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("l");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("m");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("n");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        oButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("o");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("p");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        qButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("q");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("r");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("s");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("t");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        uButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("u");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("v");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        wButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("w");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("x");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        yButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("y");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });
        zButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean changeImg = checkLetter("z");
                if(changeImg){
                    setImage(hangmanImgView, getImgId(numGuesses));
                }
            }
        });

    }

    public void  hideMes(){
        for(int i =0; i< message.length(); i++){
            if(message.substring(i, i+1).equals(" ")){
                changePrintMes.add(" ");
            }
            else {
                changePrintMes.add("_");
            }
        }
    }

    public void printMes(){
        //add spaces
        //save changePrintMes into String printMes
        printMes = "";
        for(int i =0; i< changePrintMes.size(); i++){
            printMes+= changePrintMes.get(i);
            printMes+= " ";
        }
        msgTextView.clearComposingText();
        msgTextView.setText(printMes);
    }

    public boolean checkLetter(String letter){
        char saveLet = letter.charAt(0);
        int letIndex = (int)(saveLet - 'a') ; //a =0
        boolean foundLet = false;
        boolean showImg = false;
        if( lettersGuessed[letIndex]) {
            Toast alreadyGuessed = Toast.makeText(this, "You already guessed this letter.", Toast.LENGTH_SHORT);
            alreadyGuessed.show();
            return false; //dont change img, end method
        }
        else {
            //if letter was not guessed
            lettersGuessed[letIndex] = true;
            for (int i = 0; i < message.length(); i++) {
                //check if message contains letter
                if (message.substring(i, i + 1).equals(letter)) {
                    foundLet = true;
                    break;
                }
            }
            if (foundLet) {
                showLetterInMes(letter);
                printMes();
            } else {
                numGuesses--;
                if(numGuesses==0){
                    numGuessTxtView.setText(numGuesses+"");
                    numGuessTxtView.setTextColor( 255);
                    Intent lost = new Intent(GameActivity.this, GameOver.class);
                    lost.putExtra("message", message);
                    lost.putExtra("gameStatus", "lost");
                    startActivity(lost);
                    return true;
                }
                numGuessTxtView.clearComposingText();
                numGuessTxtView.setText(numGuesses+"");
                showImg = true;
                printIncorrectLet += letter;
                printIncorrectLet += " ";
                letGuessedTxtView.setText(printIncorrectLet);
            }
        }
        return showImg;
    }

    public void showLetterInMes(String letter){
        for(int i =0; i< message.length(); i++){
            if((message.substring(i, i+1)).equals(letter)){
                changePrintMes.set(i, letter);
            }
        }
        boolean allLetVisible = true;
        for(int i =0; i<message.length(); i++){
            if(!message.substring(i, i+1).equals(changePrintMes.get(i)) ){
                allLetVisible = false;
                break;
            }
        }
        if(allLetVisible){
            Intent won = new Intent(GameActivity.this, GameOver.class);
            won.putExtra("message", message);
            won.putExtra("gameStatus", "won");
            startActivity(won);
        }
    }

    public int getImgId( int index){
        switch (index){
            case 0: return R.drawable.hangman12;
            case 1: return R.drawable.hangman11;
            case 2: return R.drawable.hangman10;
            case 3: return R.drawable.hangman9;
            case 4: return R.drawable.hangman8;
            case 5: return R.drawable.hangman7;
            case 6: return R.drawable.hangman6;
            case 7: return R.drawable.hangman5;
            default:return -1;
        }
    }

    public void setImage(ImageView imgView, int pic){
        Bitmap scaledImgView = BitmapFactory.decodeResource(getResources(), pic);
        imgView.setImageBitmap(scaledImgView);
    }

}




