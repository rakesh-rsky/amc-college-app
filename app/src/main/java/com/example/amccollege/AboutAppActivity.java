package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutAppActivity extends AppCompatActivity {

    TextView textView4;
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        getSupportActionBar().hide();

        textView4 =(TextView) findViewById(R.id.textView4);
        textView6 =(TextView) findViewById(R.id.textView6);

        textView4.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);

    }
}