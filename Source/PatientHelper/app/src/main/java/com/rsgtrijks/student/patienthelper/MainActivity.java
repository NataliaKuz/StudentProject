package com.rsgtrijks.student.patienthelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String USERNAME = "Stefanie";
    public static final String PASSWORD = "Welkom123";
    // this is a variable that represent a number 0 (int for Integer)
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Almost all activities interact with the user, so the Activity class takes care of creating a window for you in which you can
        // place your UI with setContentView(View).
        setContentView(R.layout.activity_main);

        // retrieving the button to interact with it
        Button button = (Button) findViewById(R.id.loginButton);
        final TextView resultTextView = (TextView) findViewById(R.id.result);
        final EditText userNameField = (EditText) findViewById(R.id.usernameField);
        final EditText passwordField = (EditText) findViewById(R.id.passwordField);

        // Let's put the working login in the text fields so we don't have to type it all the time
        userNameField.setText(USERNAME);
        passwordField.setText(PASSWORD);

        // creating a click listener
        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = userNameField.getText().toString();
                String password = passwordField.getText().toString();

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    resultTextView.setText("Ingelogd");

                    // launch the next screen you need to create an "Intent"
                    // first parameter is the current class that is launching the next screen
                    // second parameter is the screen you want to launch
                    Intent intent = new Intent(MainActivity.this, DiagnosticActivity.class);

                    // simply call start
                    startActivity(intent);

                } else {
                    resultTextView.setText("Foute login");
                }
            }
        };

        // connect the click listener with the button
        button.setOnClickListener(buttonClickListener);
    }
}
