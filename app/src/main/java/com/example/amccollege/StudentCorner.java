package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StudentCorner extends AppCompatActivity {


    TextView ivTextView;
    TextView glsTextView;
    TextView mfTextView;
    TextView ceTextView;
    TextView sportsTextView;
    TextView nssTextView;
    TextView caTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_corner);

        ivTextView = (TextView) findViewById(R.id.ivTextView);
        glsTextView = (TextView) findViewById(R.id.glsTextView);
        mfTextView = (TextView) findViewById(R.id.mfTextView);
        ceTextView = (TextView) findViewById(R.id.ceTextView);
        sportsTextView = (TextView) findViewById(R.id.sportsTextView);
        nssTextView = (TextView) findViewById(R.id.nssTextView);
        caTextView = (TextView) findViewById(R.id.caTextView);


        ivTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/Industrial%20Visit-18-19.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
        glsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/Guest%20Lectures%20and%20Seminars-18-19.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        mfTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/Relish-2019.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });


        ceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/CulturalEvents.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });


        sportsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/SportsEvents.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        nssTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/NSSActivities.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        caTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse("https://www.amcgroup.edu.in/amc/images/Celebration18-19.pdf"), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(),
                            "No Application Available to View PDF",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}