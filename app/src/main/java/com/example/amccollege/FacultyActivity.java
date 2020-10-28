package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FacultyActivity extends AppCompatActivity {


    TextView mechanicalTextView;
    TextView civilTextView;
    TextView eeTextView;
    TextView ecTextView;
    TextView csTextView;
    TextView mcaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_faculty);

//        https://www.amcgroup.edu.in/amc/Faculty.php


        mechanicalTextView = (TextView) findViewById(R.id.mechanicalTextView);
        civilTextView = (TextView) findViewById(R.id.civilTextView);
        eeTextView = (TextView) findViewById(R.id.eeTextView);
        ecTextView = (TextView) findViewById(R.id.ecTextView);
        csTextView = (TextView) findViewById(R.id.csTextView);
        mcaTextView = (TextView) findViewById(R.id.mcaTextView);

        mechanicalTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/AMCEC/Mech-Faculty-List.php");
                intent.putExtra("topic","Mechanical Faculty");
                startActivity(intent);

            }
        });
        civilTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Civil-Faculty_List.php");
                intent.putExtra("topic","Civil Faculty");
                startActivity(intent);

            }
        });

        eeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/EE-Faculty-List.php");
                intent.putExtra("topic","Electrical & Electronic Faculty");
                startActivity(intent);

            }
        });


        ecTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/EC-Faculty-List.php");
                intent.putExtra("topic","Electronic Communication");
                startActivity(intent);

            }
        });


        csTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/CS-Faculty-List.php");
                intent.putExtra("topic","Computer Science Faculty");
                startActivity(intent);

            }
        });

        mcaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","");
                intent.putExtra("topic","MCA Faculty");
                startActivity(intent);

            }
        });




    }
}