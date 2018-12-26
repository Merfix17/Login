package com.example.android.day13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button sign_up, login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up = findViewById(R.id.sign_up);
        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        sign_up.setOnClickListener(this);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_up:
                Intent intent1 = new Intent(this, Activity2.cla ss);
                startActivity(intent1);
                break;

            case R.id.login:
                Intent intent2 = new Intent(this, Activity3.class);
                startActivity(intent2);
                break;

            case R.id.results:
                Intent intent3 = new Intent(this, Activity4.class);
                startActivity(intent3);
//                username_res.setText(username.toString());
//                password_res.setText(password.toString());
                break;
        }
    }
}
