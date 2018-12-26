package com.example.android.day13;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    Button results;
    TextView username_res, password_res, username_main, password_main;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        results = findViewById(R.id.results);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        username_main = findViewById(R.id.username_main);
        password_main = findViewById(R.id.password_main);

        results.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent3 = new Intent(this, Activity4.class);
        intent3.putExtra("username",username.getText().toString());
        intent3.putExtra("password",password.getText().toString());

//        startActivity(intent3);
        startActivityForResult(intent3, 1);

        password_res.setText(password.getText().toString());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null) {
            return;
        }

        String name = data.getStringExtra("name");
        String word = data.getStringExtra("word");

        Log.i("info",name);
        Log.i("info",word);

        username_main.setText("Ur name is " + name);
        password_main.setText("Ur password is " + word);
    }
}