package com.rsgtrijks.student.patienthelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 310193817 on 16/02/2017.
 */

public class DetailActivity extends AppCompatActivity {

    public static final String CATAGORY = "CATAGORY";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        String category = getIntent().getExtras().getString(CATAGORY);

        TextView title = (TextView) findViewById(R.id.Title);
        title.setText(category);
    }
}

