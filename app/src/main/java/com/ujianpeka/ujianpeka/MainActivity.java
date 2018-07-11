package com.ujianpeka.ujianpeka;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * UjianPeka
 * Code By Aryy404 on 11/07/2018
 * Mail : aryy.newbie@gmail.com
 * CopyRight (c) 2018
 */
public class MainActivity extends AppCompatActivity {

    private static MediaPlayer mpbg, mp;
    ImageButton btnPlay, btnExit, btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpbg = MediaPlayer.create(getApplicationContext(), R.raw.sounda);
        mpbg.setLooping(true);
        mpbg.start();

        btnPlay = (ImageButton) findViewById(R.id.play);
        btnExit = (ImageButton) findViewById(R.id.exit);
        btnAbout = (ImageButton) findViewById(R.id.about);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpbg.stop();
                playSoundBenar(getApplicationContext());
                vibrate(getApplicationContext());
                Intent intent = new Intent(MainActivity.this, PlayGame.class);
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSoundSalah(getApplicationContext());
                moveTaskToBack(true);
                mpbg.stop();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSoundBenar(getApplicationContext());
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
    }

    public static void playSound (Context c, int sound){
        if (mp!=null){
            if (mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }
        mp = MediaPlayer.create(c, sound);
        mp.start();
    }

    public static void playSoundBenar(Context c){
        playSound(c, R.raw.benar);
    }
    public static void playSoundSalah(Context c){
        playSound(c, R.raw.salah);
    }
    public static void vibrate(Context c){
        Vibrator v = (Vibrator) c.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(500);
    }


    public void onBackPressed(){
        moveTaskToBack(true);
        mpbg.stop();
    }
}
