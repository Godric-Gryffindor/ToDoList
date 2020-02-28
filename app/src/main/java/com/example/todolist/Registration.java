package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    TextView textViewSignIn;
    EditText editTextEmail,editTextPass;
    Button buttonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        textViewSignIn=findViewById(R.id.textViewLogin);
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPass=findViewById(R.id.editTextPassword);
        buttonRegister=findViewById(R.id.buttonRegister);

        textViewSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this,MainActivity.class)  ;
                startActivity(intent);
                finish();
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                registration();
              /*
                Intent intent= new Intent(Registration.this,HomeScreen.class);
                startActivity(intent);
                finish();
              */
            }
        });

    }
    private Boolean registration(){
        String email,pass;
        email=editTextEmail.getText().toString().trim();
        pass=editTextPass.getText().toString().trim();
        Log.d("Email", email);
        Log.d("Password", pass);
        if (email.isEmpty()){
            Toast.makeText(this, "Enter your email to proceed ", Toast.LENGTH_SHORT).show();
        }else if(pass.isEmpty()){
            Toast.makeText(this, "Enter your password to proceed ", Toast.LENGTH_SHORT).show();
        }else if (pass.length()<6){
            Toast.makeText(this, "Password length must be more than 5 characters ", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
