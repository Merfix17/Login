package com.example.android.day13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    TextView username_res;
    TextView password_res;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        username_res = findViewById(R.id.username_res);
        password_res = findViewById(R.id.password_res);
        back = findViewById(R.id.back);

        back.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            username_res.setText(bundle.getString("username"));
            password_res.setText(bundle.getString("password"));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", username_res.getText().toString());
        intent.putExtra("word", password_res.getText().toString());

        setResult(RESULT_OK, intent);
        finish();
    }
}
