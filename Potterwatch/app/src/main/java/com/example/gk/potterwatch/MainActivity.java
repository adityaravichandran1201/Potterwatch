package com.example.gk.potterwatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // To check whether is already existing or not. This is to ensure which page to open. Sorting Hat or Muggle? SignUp
    private boolean userExistence = true;
    // Variable for Alohomora
    private String enterName;
    private String enterEmail;
    private String enterPassword;

    public boolean getUserExistence() {
        return userExistence;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating both the buttons
        final Button buttonAlohomora = (Button) findViewById(R.id.alohomora);
        final Button buttonSignUp = (Button) findViewById(R.id.signUp);

        //Setting a click listener on the Alohomora Button
        buttonAlohomora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Getting the entered name
                EditText eName = (EditText) findViewById(R.id.name);
                enterName = eName.getText().toString();

                //Getting the entered email ID
                EditText eEmail = (EditText) findViewById(R.id.email);
                enterEmail = eEmail.getText().toString();

                //Getting the password.
                // TODO: Check the password with the data collected from the server.

                EditText ePassword = (EditText) findViewById(R.id.password);
                enterPassword = ePassword.getText().toString();

                /** Actual code. Final code depiction
                 if(getUserExistence()) {
                 Intent sortingHatIntent = new Intent(MainActivity.this, SortingHat.class);
                 startActivity(sortingHatIntent);
                 }**/

                Intent sortingHatIntent = new Intent(MainActivity.this, SortingHat.class);
                startActivity(sortingHatIntent);
            }
        });

        // Setting a click listener on the Muggle?SignUp Button
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(MainActivity.this, SignUp.class);
                startActivity(SignUp);

            }
        });
    }


}
