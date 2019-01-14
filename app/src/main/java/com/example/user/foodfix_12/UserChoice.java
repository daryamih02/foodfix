package com.example.user.foodfix_12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserChoice extends AppCompatActivity {
    TextView textViewUs;
    TextView textViewRst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textViewRst = findViewById(R.id.restorator);
        textViewUs = findViewById(R.id.user);
    }

}
