package com.example.guruapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText userNameId,passwordId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userNameId= findViewById(R.id.username);
        passwordId= findViewById(R.id.password);


    }

    public void Login(View view){
        String userName =userNameId.getText().toString();
        String password = passwordId.getText().toString();

        if(userName.equals("Admin")){

            Intent admin  = new Intent(this,MainActivity.class);
            startActivity(admin);

        }else{

            Intent student  = new Intent(this,StudentProfile.class);
            startActivity(student);
        }
    }
}
