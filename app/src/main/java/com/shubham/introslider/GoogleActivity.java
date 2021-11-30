package com.shubham.introslider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class GoogleActivity extends AppCompatActivity {


    private SmsRetriever GoogleSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Build a GoogleSignInClient with the options specified by gso.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        // Build a GoogleSignInClient with the options specified by gso.
        Object mGoogleSignInClient = GoogleSignIn.getClient(this);

    }


}