package com.example.eventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView logintosign=(TextView)findViewById(R.id.logtosign_txt);
        EditText uniqueid=(EditText)findViewById(R.id.unername_et);
        EditText passwordcheck=(EditText)findViewById(R.id.password_et);
        TextView forgetpassword=(TextView)findViewById(R.id.forget_txt);
        Button loginbtn=(Button)findViewById(R.id.login_btn);

        logintosign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logintosignintent=new Intent(Login.this,Registration.class);
                startActivity(logintosignintent);
            }
        });

    }
}