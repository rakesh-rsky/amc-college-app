package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView collegeWebsite1;
    TextView collegeWebsite2;
    TextView enquiryForm;
    TextView amcBlog;
    TextView covidInfo;
    TextView aboutAppTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        collegeWebsite1 = (TextView) findViewById(R.id.collegeWebsite1);
        collegeWebsite2 = (TextView) findViewById(R.id.collegeWebsite2);
        enquiryForm =(TextView) (findViewById(R.id.enquiryForm));
        amcBlog = (TextView) findViewById(R.id.amcBlog);
        covidInfo = (TextView) findViewById(R.id.covidInfo);
        aboutAppTextView = (TextView) findViewById(R.id.aboutAppTextView);

        collegeWebsite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                //intent.putExtra("url", "https://amcgroup.edu.in/AMCEC");
                //intent.putExtra("topic", "AMC Engineering College");
                Intent intent = new Intent(getApplicationContext(), AmcMainActivity.class);
                intent.putExtra("collegeName", "amcec");
                startActivity(intent);
            }
        });

        collegeWebsite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AmcMainActivity.class);
//                intent.putExtra("url", "https://amcgroup.edu.in/AMC");
//                intent.putExtra("topic", "AMC Management College");
                intent.putExtra("collegeName", "amc");
                startActivity(intent);
            }
        });

        enquiryForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amceducation.in/apply");
                intent.putExtra("topic", "Enquiry Form");
                startActivity(intent);

            }
        });

        amcBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/blog");
                intent.putExtra("topic", "AMC Blog");
                startActivity(intent);

            }
        });


        covidInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.covid.amcgroup.edu.in");
                intent.putExtra("topic", "Covid19 Information");
                startActivity(intent);

            }
        });

        aboutAppTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), AboutAppActivity.class);
                startActivity(intent);
            }
        });

    }

    private boolean exit=false;
    @Override
    public void onBackPressed() {

            if(exit){
                finish();
            }else{
                Toast.makeText(this, "Press Again to Exit..", Toast.LENGTH_SHORT).show();
            }

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    exit=false;
                }
            }, 2000);

            exit=true;
    }
}