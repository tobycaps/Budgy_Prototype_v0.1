package com.example.budgy_prototype_v01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Button back = (Button)findViewById(R.id.back);

        back.setOnClickListener(v -> {


            Intent intent = new Intent(getApplicationContext(), MainActivity.class);

            startActivity(intent);
        });
    }
}