package com.rsgtrijks.student.patienthelperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Activity is one of the major components of an Android app. An activity is a single, focused thing that the user can do.

public class MainActivity extends AppCompatActivity {

    // this is a variable that represent a number 0 (int for Integer)
    int clickCount = 0;

    // onCreate method is where you initialize your activity. Most importantly, here you will usually call setContentView(int) with a layout
    // resource defining your UI, and using findViewById(int) to retrieve the widgets in that UI that you need to interact with programmatically.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Almost all activities interact with the user, so the Activity class takes care of creating a window for you in which you can
        // place your UI with setContentView(View).
        setContentView(R.layout.activity_main);

        // retrieving the button to interact with it
        Button button = (Button) findViewById(R.id.button);

        // creating a click listener
        View.OnClickListener buttonClickListener = new View.OnClickListener() {

            // this method will be invoked once the button is clicked
            @Override
            public void onClick(View v) {
                // add one to our count
                clickCount = clickCount + 1;

                // prepare another variable that represents text (String)
                String text = "Button clicked: " + clickCount;

                // retrieving another component: textView to interact with it
                TextView textView = (TextView) findViewById(R.id.textView);

                // connect the text with the textView
                textView.setText(text);
            }
        };

        // connect the click listener with the button
        button.setOnClickListener(buttonClickListener);
    }
}
