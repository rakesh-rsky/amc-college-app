package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FacilitiesActivity extends AppCompatActivity {


    TextView hostelTextView;
    CardView hostelCard;
    TextView transportTextView;
    CardView transportCard;
    TextView libraryTextView;
    CardView libraryCard;
    TextView canteenTextView;
    CardView canteenCard;
    TextView fitnessZoneTextView;
    CardView fitnessZoneCard;
    TextView bankAndPostOfficeTextView;
    CardView bankAndPostOfficeCard;
    TextView ladiesLoungeTextView;
    CardView ladiesLoungeCard;
    TextView tcsIonTextView;
    CardView tcsIonCard;
    TextView healthCareTextView;
    CardView healthCareCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_facilities);


        hostelTextView = (TextView) findViewById(R.id.hostelTextView);
        hostelCard = (CardView) findViewById(R.id.hostelCard);
        transportTextView = (TextView) findViewById(R.id.transportTextView);
        transportCard = (CardView) findViewById(R.id.transportCard);
        libraryTextView = (TextView) findViewById(R.id.libraryTextView);
        libraryCard = (CardView) findViewById(R.id.libraryCard);
        canteenTextView = (TextView) findViewById(R.id.canteenTextView);
        canteenCard = (CardView) findViewById(R.id.canteenCard);
        fitnessZoneTextView = (TextView) findViewById(R.id.fitnessZoneTextView);
        fitnessZoneCard = (CardView) findViewById(R.id.fitnessZoneCard);
        bankAndPostOfficeTextView = (TextView) findViewById(R.id.bankAndPostOfficeTextView);
        bankAndPostOfficeCard = (CardView) findViewById(R.id.bankAndPostOfficeCard);
        ladiesLoungeTextView = (TextView) findViewById(R.id.ladiesLoungeTextView);
        ladiesLoungeCard = (CardView) findViewById(R.id.ladiesLoungeCard);
        tcsIonTextView = (TextView) findViewById(R.id.tcsIonTextView);
        tcsIonCard = (CardView) findViewById(R.id.tcsIonCard);
        healthCareTextView = (TextView) findViewById(R.id.healthCareTextView);
        healthCareCard = (CardView) findViewById(R.id.healthCareCard);

//***********************************************************************


        View.OnClickListener hostelClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/Hostel.php");
                intent.putExtra("topic", "Hostel");
                startActivity(intent);
            }
        };
        hostelTextView.setOnClickListener(hostelClickListener);
        hostelCard.setOnClickListener(hostelClickListener);
//***********************************************************************


        View.OnClickListener transportClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/transport.php");
                intent.putExtra("topic", "Transport");
                startActivity(intent);
            }
        };
        transportTextView.setOnClickListener(transportClickListener);
        transportCard.setOnClickListener(transportClickListener);
//***********************************************************************

        View.OnClickListener libraryClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/Library_new.php");
                intent.putExtra("topic", "Library");
                startActivity(intent);
            }
        };
        libraryTextView.setOnClickListener(libraryClickListener);
        libraryCard.setOnClickListener(libraryClickListener);
//***********************************************************************

        View.OnClickListener canteenClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/Canteen.php");
                intent.putExtra("topic", "Canteen");
                startActivity(intent);
            }
        };
        canteenTextView.setOnClickListener(canteenClickListener);
        canteenCard.setOnClickListener(canteenClickListener);
//***********************************************************************

        View.OnClickListener fitnessZoneClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/fitness.php");
                intent.putExtra("topic", "Fitness Zone");
                startActivity(intent);
            }
        };
        fitnessZoneTextView.setOnClickListener(fitnessZoneClickListener);
        fitnessZoneCard.setOnClickListener(fitnessZoneClickListener);
//***********************************************************************

        View.OnClickListener bankAndPostClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/bank.php");
                intent.putExtra("topic", "Bank & Post Office");
                startActivity(intent);
            }
        };
        bankAndPostOfficeTextView.setOnClickListener(bankAndPostClickListener);
        bankAndPostOfficeCard.setOnClickListener(bankAndPostClickListener);
//***********************************************************************

        View.OnClickListener ladiesLoungeClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/lounge.php");
                intent.putExtra("topic", "Ladies Lounge");
                startActivity(intent);
            }
        };
        ladiesLoungeTextView.setOnClickListener(ladiesLoungeClickListener);
        ladiesLoungeCard.setOnClickListener(ladiesLoungeClickListener);
//***********************************************************************

        View.OnClickListener tcsIonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/TCS_iON.php");
                intent.putExtra("topic", "TCS Ion");
                startActivity(intent);
            }
        };
        tcsIonTextView.setOnClickListener(tcsIonClickListener);
        tcsIonCard.setOnClickListener(tcsIonClickListener);
//***********************************************************************

        View.OnClickListener healthCareClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/AMC_Healthcare.php");
                intent.putExtra("topic", "Health Care");
                startActivity(intent);
            }
        };
        healthCareTextView.setOnClickListener(healthCareClickListener);
        healthCareCard.setOnClickListener(healthCareClickListener);
//***********************************************************************

    }
}