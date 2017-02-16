package com.rsgtrijks.student.patienthelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Floor on 11/01/2017.
 */

public class DiagnosticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diagnostics);

        Button button = (Button) findViewById(R.id.ButtonTia);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(DiagnosticActivity.this, TiaActivity.class);

                // simply call start
                startActivity(intent);

            }
        });
        Button heartattackButton = (Button) findViewById(R.id.ButtonHeartAttack);

        heartattackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch the next screen you need to create an "Intent"
                // first parameter is the current class that is launching the next screen
                // second parameter is the screen you want to launch
                Intent intent = new Intent(DiagnosticActivity.this, HeartattackActivity.class);

                // simply call start
                startActivity(intent);

            }
        });
    }
}
