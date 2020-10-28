package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdmissionActivity extends AppCompatActivity {


      TextView admissionEnquiryFormTextView;
    TextView admissionBrochureTextView;
    TextView eligibilityCriteriaTextView;
    TextView eligibilityCriteriaPgTextView;
    TextView feeStrucutreTextView;
    TextView contactForAdmissionTextView;
    TextView mapToAmcTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);


        admissionEnquiryFormTextView = (TextView) findViewById(R.id.admissionEnquiryFormTextView);
        admissionBrochureTextView = (TextView) findViewById(R.id.admissionBrochureTextView);
        eligibilityCriteriaTextView = (TextView) findViewById(R.id.eligibilityCriteriaTextView);
        eligibilityCriteriaPgTextView = (TextView) findViewById(R.id.eligibilityCriteriaPgTextView);
        feeStrucutreTextView = (TextView) findViewById(R.id.feeStrucutreTextView);
        contactForAdmissionTextView = (TextView) findViewById(R.id.contactForAdmissionTextView);
        mapToAmcTextView = (TextView) findViewById(R.id.mapToAmcTextView);


        admissionEnquiryFormTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/online-form/");
                intent.putExtra("topic","Admission Enquiry Form");
                startActivity(intent);

            }
        });
        admissionBrochureTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/image/AMCEC2020FEEFLYER.pdf");
                intent.putExtra("topic","Admission Brochure");
                startActivity(intent);

            }
        });

        eligibilityCriteriaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Eligibility_for_Graduation.php");
                intent.putExtra("topic","Eligilibity Criteria UG");
                startActivity(intent);

            }
        });


        eligibilityCriteriaPgTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/eligibility_for_PG.php");
                intent.putExtra("topic","Eligilibity Criteria PG");
                startActivity(intent);

            }
        });


        feeStrucutreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Fees_Structure.php");
                intent.putExtra("topic","Fee Structure");
                startActivity(intent);

            }
        });

        contactForAdmissionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/contactadmissions.php");
                intent.putExtra("topic","Contact For Admission");
                startActivity(intent);

            }
        });

        mapToAmcTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url","https://www.amcgroup.edu.in/amcec/map.php");
                intent.putExtra("topic","Map To AMCEC");
                startActivity(intent);

            }
        });



    }
}