package com.rsgtrijks.student.patienthelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.rsgtrijks.student.patienthelper.DetailActivity.HEARTATACK_ICD;
import static com.rsgtrijks.student.patienthelper.DetailActivity.HEARTATACK_WATISHET;
import static com.rsgtrijks.student.patienthelper.DetailActivity.HEARTATACK_MEDICIJNEN;
import static com.rsgtrijks.student.patienthelper.DetailActivity.HEARTATACK_NAZORG;

/**
 * Created by 310193817 on 16/02/2017.
 */

public class HeartattackActivity extends AppCompatActivity {

    public static final String CATAGORY = "CATAGORY";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_heartattack);
        Button button = (Button) findViewById(R.id.Medicines);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(HeartattackActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, HEARTATACK_MEDICIJNEN);
                // simply call start
                startActivity(intent);

            }
        });

        Button buttonAfterCare = (Button) findViewById(R.id.Aftercare);
        buttonAfterCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(HeartattackActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, HEARTATACK_NAZORG);
                // simply call start
                startActivity(intent);

            }
        });
        Button buttonWhatItIs = (Button) findViewById(R.id.WhatItIs);
        buttonWhatItIs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(HeartattackActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, HEARTATACK_WATISHET);
                // simply call start
                startActivity(intent);

            }
        });
        Button buttonICD = (Button) findViewById(R.id.ICD);
        buttonICD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(HeartattackActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY,HEARTATACK_ICD);
                // simply call start
                startActivity(intent);
            }
        });
    }
}
