package com.ujianpeka.ujianpeka;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * UjianPeka
 * Code By Aryy404 on 11/07/2018
 * Mail : aryy.newbie@gmail.com
 * CopyRight (c) 2018
 */
public class PlayGame extends AppCompatActivity {

    private static MediaPlayer mpbg, mp;
    TextView tvSkor, tvSoal, jawaban1, jawaban2, jawaban3, jawaban4;
    ImageView bintang1, bintang2, bintang3;

    int skor=0;
    int arr;
    int x;
    String jawaban;

    Soal soal = new Soal();

    TextView waktu;
    CountDownTimer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        mpbg = MediaPlayer.create(getApplicationContext(), R.raw.soundb);
        mpbg.setLooping(true);
        mpbg.start();

        tvSkor = (TextView) findViewById(R.id.point);
        tvSoal = (TextView) findViewById(R.id.pertanyaan);
        jawaban1 = (TextView) findViewById(R.id.soal_0);
        jawaban2 = (TextView) findViewById(R.id.soal_1);
        jawaban3 = (TextView) findViewById(R.id.soal_2);
        jawaban4 = (TextView) findViewById(R.id.soal_3);

        bintang1 = (ImageView) findViewById(R.id.bintang1);
        bintang2 = (ImageView) findViewById(R.id.bintang2);
        bintang3 = (ImageView) findViewById(R.id.bintang3);

        waktu = findViewById(R.id.timer);

        counter = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long l) {
                waktu.setText(""+l/1000);
            }

            @Override
            public void onFinish() {
                if (bintang3.getVisibility() == View.VISIBLE){
                    playSoundSalah(getApplicationContext());
                    vibrate(getApplicationContext());
                    bintang3.setVisibility(View.INVISIBLE);
                }else if (bintang3.getVisibility() == View.INVISIBLE && bintang2.getVisibility() == View.VISIBLE){
                    playSoundSalah(getApplicationContext());
                    vibrate(getApplicationContext());
                    bintang2.setVisibility(View.INVISIBLE);
                }else if (bintang2.getVisibility() == View.INVISIBLE && bintang1.getVisibility() == View.VISIBLE){
                    playSoundSalah(getApplicationContext());
                    vibrate(getApplicationContext());
                    bintang1.setVisibility(View.INVISIBLE);
                }else{

                }
                tvSkor.setText(""+skor);
//                Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        };

        counter.start();
        tvSkor.setText(""+skor);
        setKonten();

        jawaban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jawaban1.getText().toString().equals(jawaban)){
                    playSoundBenar(getApplicationContext());
                    counter.cancel();
                    skor = skor + 10;
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Benar", Toast.LENGTH_SHORT).show();
                    setKonten();
                }else{
                    if (bintang3.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang3.setVisibility(View.INVISIBLE);
                    }else if (bintang3.getVisibility() == View.INVISIBLE && bintang2.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang2.setVisibility(View.INVISIBLE);
                    }else if (bintang2.getVisibility() == View.INVISIBLE && bintang1.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang1.setVisibility(View.INVISIBLE);
                    }else{

                    }
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();
                    setKonten();
                }
            }
        });
        jawaban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jawaban2.getText().toString().equals(jawaban)){
                    playSoundBenar(getApplicationContext());
                    counter.cancel();
                    skor = skor + 10;
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Benar", Toast.LENGTH_SHORT).show();
                    setKonten();
                }else{
                    if (bintang3.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang3.setVisibility(View.INVISIBLE);
                    }else if (bintang3.getVisibility() == View.INVISIBLE && bintang2.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang2.setVisibility(View.INVISIBLE);
                    }else if (bintang2.getVisibility() == View.INVISIBLE && bintang1.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang1.setVisibility(View.INVISIBLE);
                    }else{

                    }
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();
                    setKonten();
                }
            }
        });
        jawaban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jawaban3.getText().toString().equals(jawaban)){
                    playSoundBenar(getApplicationContext());
                    counter.cancel();
                    skor = skor + 10;
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Benar", Toast.LENGTH_SHORT).show();
                    setKonten();
                }else{
                    if (bintang3.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang3.setVisibility(View.INVISIBLE);
                    }else if (bintang3.getVisibility() == View.INVISIBLE && bintang2.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang2.setVisibility(View.INVISIBLE);
                    }else if (bintang2.getVisibility() == View.INVISIBLE && bintang1.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang1.setVisibility(View.INVISIBLE);
                    }else{

                    }
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();
                    setKonten();
                }
            }
        });
        jawaban4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jawaban4.getText().toString().equals(jawaban)){
                    playSoundBenar(getApplicationContext());
                    counter.cancel();
                    skor = skor + 10;
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Benar", Toast.LENGTH_SHORT).show();
                    setKonten();
                }else{
                    if (bintang3.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang3.setVisibility(View.INVISIBLE);
                    }else if (bintang3.getVisibility() == View.INVISIBLE && bintang2.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang2.setVisibility(View.INVISIBLE);
                    }else if (bintang2.getVisibility() == View.INVISIBLE && bintang1.getVisibility() == View.VISIBLE){
                        playSoundSalah(getApplicationContext());
                        vibrate(getApplicationContext());
                        counter.cancel();
                        bintang1.setVisibility(View.INVISIBLE);
                    }else{

                    }
                    tvSkor.setText(""+skor);
//                    Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();
                    setKonten();
                }
            }
        });
    }

    public void setKonten(){
        arr = soal.pertanyaan.length;
        if(x >= arr || bintang1.getVisibility() == View.INVISIBLE){
            String jumlahSkor = String.valueOf(skor);

            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.lay_pop_hasil);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            TextView textPoint = (TextView) dialog.findViewById(R.id.point_peka);
            textPoint.setText("Point Kepekaan Mu Adalah "+jumlahSkor+" Point!! Belajar Lebih Giat Lagi!! :P");
            ImageView logoPop1 = (ImageView) dialog.findViewById(R.id.logo_pop_up);
            ImageView logoPop2 = (ImageView) dialog.findViewById(R.id.logo_pop_up2);
            ImageView logoPop3 = (ImageView) dialog.findViewById(R.id.logo_pop_up3);
            logoPop1.setImageResource(R.drawable.ic_bintang);
            logoPop2.setImageResource(R.drawable.bg_piala);
            logoPop3.setImageResource(R.drawable.ic_bintang);

            ImageButton btnBack = (ImageButton) dialog.findViewById(R.id.ulang_main);
            ImageButton btnHome = (ImageButton) dialog.findViewById(R.id.kembali_home);

            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mpbg.stop();
                    playSoundSalah(getApplicationContext());
                    vibrate(getApplicationContext());
                    Intent intent = new Intent(PlayGame.this, PlayGame.class);
                    startActivity(intent);
                    finish();
                }
            });

            btnHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mpbg.stop();
                    playSoundBenar(getApplicationContext());
                    Intent intent = new Intent(PlayGame.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });

            dialog.show();
        }else{

            counter.start();
            tvSoal.setText(soal.getPertanyaan(x));
            jawaban1.setText(soal.getPilihanJawaban1(x));
            jawaban2.setText(soal.getPilihanJawaban2(x));
            jawaban3.setText(soal.getPilihanJawaban3(x));
            jawaban4.setText(soal.getPilihanJawaban4(x));
            jawaban = soal.getJawabanBenar(x);
        }
        x++;
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
        Toast.makeText(this, "Selesaikan kuis dulu!!", Toast.LENGTH_SHORT).show();
    }
}