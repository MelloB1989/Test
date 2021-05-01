package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button Login;
    EditText Username, Password;
    String User0, User1, Pass0, Pass1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Username = (EditText) findViewById (R.id.Username);
        Password = (EditText) findViewById (R.id.Password);
        Login = (Button) findViewById (R.id.Login);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                User0 = Username.getText().toString();
                Pass0 = Password.getText().toString();
                User1 = "Arjun";
                Pass1 = "AJK";

                if (User0.equals(User1) && Pass0.equals(Pass1))
                { Context context = getApplicationContext();
                    CharSequence text = "Access Gained";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Access Denied";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

                }
            });
    }
}