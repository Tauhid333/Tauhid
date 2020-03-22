package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private EditText usernameEditText,passwordEditText;
    private Button loginButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        usernameEditText=findViewById(R.id.user);
        passwordEditText=findViewById(R.id.pass);
        loginButton=findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usernameEditText.getText().toString();
                String password=passwordEditText.getText().toString();
                if(username.equals("Touhid")&& password.equals("12345"))
                {
                    Intent intent=new Intent(HomeActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else {
                    loginButton.setEnabled(false);
                }




            }

        });


            }

}
