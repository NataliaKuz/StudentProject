package com.rsgtrijks.student.patienthelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
                intent.putExtra(CATAGORY, "Medicijnen");
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
                intent.putExtra(CATAGORY, "Nazorg");
                // simply call start
                startActivity(intent);

            }
        });
    }
}
