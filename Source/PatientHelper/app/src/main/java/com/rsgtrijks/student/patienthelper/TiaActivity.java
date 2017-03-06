package com.rsgtrijks.student.patienthelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import static com.rsgtrijks.student.patienthelper.DetailActivity.TIA_COMPENSATION;
import static com.rsgtrijks.student.patienthelper.DetailActivity.TIA_MEDICIJNEN;
import static com.rsgtrijks.student.patienthelper.DetailActivity.TIA_ONTSTAAN;
import static com.rsgtrijks.student.patienthelper.DetailActivity.TIA_RECOGNISE;
import static com.rsgtrijks.student.patienthelper.DetailActivity.TIA_REVALIDATIE;

/**
 * Created by Natalia on 30/01/2017.
 */

public class TiaActivity extends Activity {

    public static final String CATAGORY = "CATAGORY";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tia);

        Button buttonMedicines = (Button) findViewById(R.id.Medicines);
        buttonMedicines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(TiaActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, TIA_MEDICIJNEN);
                // simply call start
                startActivity(intent);

            }
        });

        Button buttonRevalidation = (Button) findViewById(R.id.Revalidation);
        buttonRevalidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(TiaActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, TIA_REVALIDATIE);
                // simply call start
                startActivity(intent);

            }

        });

        Button buttonRegognise = (Button) findViewById(R.id.Recognise);
        buttonRegognise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(TiaActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, TIA_RECOGNISE);
                // simply call start
                startActivity(intent);

            }

        });

        Button buttonArise = (Button) findViewById(R.id.Arise);
        buttonArise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(TiaActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, TIA_ONTSTAAN);
                // simply call start
                startActivity(intent);

            }

        });

        Button buttonCompensation = (Button) findViewById(R.id.Compensation);
        buttonCompensation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(TiaActivity.this, DetailActivity.class);
                intent.putExtra(CATAGORY, TIA_COMPENSATION);
                // simply call start
                startActivity(intent);

            }

        });


    }
}
