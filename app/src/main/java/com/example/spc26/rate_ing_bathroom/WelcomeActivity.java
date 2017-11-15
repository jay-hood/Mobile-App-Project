package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void loginOptions(View view){
        Intent intent = new Intent(this, LoginOptionsActivity.class);
        startActivity(intent);
    }
}
