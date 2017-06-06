package com.example.gk.potterwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {

    //Variable for Muggle SignUp    eSU - entered SignUP
    private String eSUFullName;
    private String eSUEmail;
    private String eSUPassword;

    //final ImageView stamp = (ImageView) findViewById(R.id.stampOkay);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        /*
        stamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Getting the entered nameN
                EditText SUNFullName =(EditText) findViewById(R.id.SUfullName);
                eSUFullName= SUNFullName.getText().toString();

                //Getting the entered email ID
                EditText SUemail =(EditText) findViewById(R.id.SUemail);
                eSUEmail= SUemail.getText().toString();

                //Getting the password.
                // TODO: Check the password with the data collected from the server.

                EditText SUPassword =(EditText) findViewById(R.id.SUpassword);
                eSUPassword= SUPassword.getText().toString();
            }
        });
        */
    }


}
