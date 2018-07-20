package com.ujianpeka.ujianpeka;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * UjianPeka
 * Code By Aryy404 on 11/07/2018
 * Mail : aryy.newbie@gmail.com
 * CopyRight (c) 2018
 */
public class MainActivity extends AppCompatActivity {

    private static MediaPlayer mpbg, mp;
    ImageButton btnPlay, btnExit, btnAbout;
    Dialog popExit, popAbout;
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
                finish();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogExit();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogAbout();
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

    public void dialogExit(){
        playSoundSalah(this);

        popExit = new Dialog(this);
        popExit.setContentView(R.layout.lay_pop_exit);
        popExit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popExit.show();

        ImageButton btnYess = (ImageButton) popExit.findViewById(R.id.yess);
        ImageButton btnNoo = (ImageButton) popExit.findViewById(R.id.noo);

        btnYess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSoundSalah(getApplicationContext());
                mpbg.stop();
                MainActivity.this.finish();
            }
        });

        btnNoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSoundBenar(getApplicationContext());
                popExit.dismiss();
            }
        });
    }

    public void dialogAbout(){
        playSoundBenar(this);

        popAbout = new Dialog(this);
        popAbout.setContentView(R.layout.lay_pop_about);
        popAbout.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popAbout.show();

        ImageButton btnClose = (ImageButton) popAbout.findViewById(R.id.btnClose);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSoundSalah(getApplicationContext());
                popAbout.dismiss();
            }
        });
    }

    public void onBackPressed(){
        dialogExit();
    }
}
