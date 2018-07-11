package com.ujianpeka.ujianpeka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * UjianPeka
 * Code By Aryy404 on 11/07/2018
 * Mail : aryy.newbie@gmail.com
 * CopyRight (c) 2018
 */
public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onBackPressed(){
        finish();
    }
}
