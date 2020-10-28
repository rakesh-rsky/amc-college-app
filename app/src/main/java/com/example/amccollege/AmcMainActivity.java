package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AmcMainActivity extends AppCompatActivity {

    TextView aboutTextView;
    CardView aboutCard;
    TextView courseTextView;
    CardView courseCard;
    TextView dhiLoginTextView;
    CardView dhiLoginCard;
    TextView onlineFeeTextView;
    CardView onlineFeeCard;
    TextView contactTextView;
    CardView contactCard;
    TextView facilitiesTextView;
    CardView facilitiesCard;
    TextView placementTextView;
    CardView placementCard;
    TextView noticeTextView;
    CardView noticeCard;
    TextView admissionTextView;
    CardView admissionCard;
    TextView facultyTextView;
    CardView facultyCard;
    TextView studentCornerTextView;
    CardView studentCornerCard;
    TextView galleryTextView;
    CardView galleryCard;
    TextView alumniTextView;
    CardView alumniCard;
    TextView collegeWebsiteTextView;
    CardView collegeWebsiteCard;
    TextView collegeSocialMediaTextView;
    CardView collegeSocialCard;

    String collegeName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        collegeName = getIntent().getExtras().getString("collegeName");

        if(collegeName.equals("amcec")){
            setTitle("AMC Engineering College");
        }else{
            setTitle("AMC Management College");
        }

        setContentView(R.layout.activity_amc_main);



        aboutTextView = (TextView) findViewById(R.id.aboutTextView);
        aboutCard = (CardView) findViewById(R.id.aboutCard);
        courseTextView = (TextView) findViewById(R.id.courseTextView);
        courseCard = (CardView) findViewById(R.id.courseCard);
        dhiLoginTextView = (TextView) findViewById(R.id.dhiLoginTextView);
        dhiLoginCard = (CardView) findViewById(R.id.dhiLoginCard);
        onlineFeeTextView = (TextView) findViewById(R.id.onlineFeeTextView);
        onlineFeeCard = (CardView) findViewById(R.id.onlineFeeCard);
        contactTextView = (TextView)findViewById(R.id.contactTextView);
        contactCard = (CardView)findViewById(R.id.contactCard);
        facilitiesTextView = (TextView) findViewById(R.id.facilitiesTextView);
        facilitiesCard = (CardView) findViewById(R.id.facilitiesCard);
        placementTextView = (TextView) findViewById(R.id.placementTextView);
        placementCard = (CardView) findViewById(R.id.placementCard);
        noticeTextView = (TextView)findViewById(R.id.noticeTextView);
        noticeCard = (CardView)findViewById(R.id.noticeCard);
        admissionTextView = (TextView) findViewById(R.id.admissionTextView);
        admissionCard = (CardView) findViewById(R.id.admissionCard);
        facultyTextView = (TextView) findViewById(R.id.facultyTextView);
        facultyCard = (CardView) findViewById(R.id.facultyCard);
        studentCornerTextView = (TextView) findViewById(R.id.studentCornerTextView);
        studentCornerCard = (CardView) findViewById(R.id.studentCornerCard);
        galleryTextView = (TextView)findViewById(R.id.galleryTextView);
        galleryCard = (CardView)findViewById(R.id.galleryCard);
        alumniTextView = (TextView) findViewById(R.id.alumniTextView);
        alumniCard = (CardView) findViewById(R.id.alumniCard);
        collegeWebsiteTextView = (TextView) findViewById(R.id.collegeWebsiteTextView);
        collegeWebsiteCard = (CardView)findViewById(R.id.collegeWebsiteCard);
        collegeSocialMediaTextView = (TextView) findViewById(R.id.collegeSocialMediaTextView);
        collegeSocialCard = (CardView) findViewById(R.id.collegeSocialMediaCard);




//**********************************************************

        View.OnClickListener aboutOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/AMCEC/Best-Engineering-College.php");
                    intent.putExtra("topic", "About AMC");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/AMC/Best-MBA-College-in-India.php");
                    intent.putExtra("topic", "About AMC");
                    startActivity(intent);

                }

            }
        };
        aboutTextView.setOnClickListener(aboutOnClickListener);
        aboutCard.setOnClickListener(aboutOnClickListener);
//***********************************************************


        View.OnClickListener courseOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), AmcecCourseActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), AmcCourseActivity.class);
                    startActivity(intent);
                }

            }
        };
        courseTextView.setOnClickListener(courseOnClickListener);
        courseCard.setOnClickListener(courseOnClickListener);
//***********************************************************


        View.OnClickListener dhiOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://amcgroup.dhi-edu.com/amcgroup_amcec");
                    intent.putExtra("topic", "Dhi Login");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://amcgroup.dhi-edu.com/amcgroup_amc");
                    intent.putExtra("topic", "Dhi Login");
                    startActivity(intent);
                }

            }
        };
        dhiLoginTextView.setOnClickListener(dhiOnClickListener);
        dhiLoginCard.setOnClickListener(dhiOnClickListener);
//***********************************************************


        View.OnClickListener onlineFeeOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(collegeName.equals("amcec")){

                 Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinesbi.com/sbicollect/icollecthome.htm"));
                 view.getContext().startActivity(intent);

//                }else{
//                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
//                    intent.putExtra("url", "https://www.onlinesbi.com/sbicollect/icollecthome.htm");
//                    intent.putExtra("topic", "Online Fee");
//                    startActivity(intent);
//                }

            }
        };
        onlineFeeTextView.setOnClickListener(onlineFeeOnClickListener);
        onlineFeeCard.setOnClickListener(onlineFeeOnClickListener);
//***********************************************************


        View.OnClickListener contactOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/contact-us.php");
                    intent.putExtra("topic", "Contact Us");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://amcgroup.edu.in/AMC/contact_amc.php");
                    intent.putExtra("topic", "Contact Us");
                    startActivity(intent);
                }

            }
        };
        contactTextView.setOnClickListener(contactOnClickListener);
        contactCard.setOnClickListener(contactOnClickListener);
//***********************************************************


        View.OnClickListener facilitiesOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), FacilitiesActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), FacilitiesActivity.class);
                    startActivity(intent);
                }

            }
        };
        facilitiesTextView.setOnClickListener(facilitiesOnClickListener);
        facilitiesCard.setOnClickListener(facilitiesOnClickListener);
//***********************************************************


        View.OnClickListener placementOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/Best-Engineering-Placements.php");
                    intent.putExtra("topic", "Placements");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amc/Best-MBA-Placements.php");
                    intent.putExtra("topic", "Placements");
                    startActivity(intent);
                }

            }
        };
        placementTextView.setOnClickListener(placementOnClickListener);
        placementCard.setOnClickListener(placementOnClickListener);
//***********************************************************


        View.OnClickListener noticeOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec");
                    intent.putExtra("topic", "AMCEC Notice");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amc");
                    intent.putExtra("topic", "AMC Notice");
                    startActivity(intent);
                }

            }
        };
        noticeTextView.setOnClickListener(noticeOnClickListener);
        noticeCard.setOnClickListener(noticeOnClickListener);
//***********************************************************


        View.OnClickListener admissionOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), AdmissionActivity.class);
                    startActivity(intent);
                }else{

                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amc/MBA-Admission-in-Bangalore-2019.php");
                    intent.putExtra("topic", "Admission");
                    startActivity(intent);
                }

            }
        };
        admissionTextView.setOnClickListener(admissionOnClickListener);
        admissionCard.setOnClickListener(admissionOnClickListener);
//***********************************************************


        View.OnClickListener facultyOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), FacultyActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amc/Faculty.php");
                    intent.putExtra("topic", "Faculty");
                    startActivity(intent);
                }

            }
        };
        facultyTextView.setOnClickListener(facultyOnClickListener);
        facultyCard.setOnClickListener(facultyOnClickListener);
//***********************************************************


        View.OnClickListener studentCornerOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/Student%20Corner.php");
                    intent.putExtra("topic", "Student Corner");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), StudentCorner.class);
                    startActivity(intent);

                }

            }
        };
        studentCornerTextView.setOnClickListener(studentCornerOnClickListener);
        studentCornerCard.setOnClickListener(studentCornerOnClickListener);
//***********************************************************


        View.OnClickListener galleryOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/gallery.php");
                    intent.putExtra("topic", "Gallery");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amc/gallery.php");
                    intent.putExtra("topic", "Gallery");
                    startActivity(intent);
                }

            }
        };
        galleryTextView.setOnClickListener(galleryOnClickListener);
        galleryCard.setOnClickListener(galleryOnClickListener);
//***********************************************************


        View.OnClickListener alumniOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/Alumni.php");
                    intent.putExtra("topic", "Alumni");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://forms.gle/AqnCWFvHb1q25krw6");
                    intent.putExtra("topic", "Alumni");
                    startActivity(intent);
                }

            }
        };
        alumniTextView.setOnClickListener(alumniOnClickListener);
        alumniCard.setOnClickListener(alumniOnClickListener);
//***********************************************************


        View.OnClickListener collegeWebsiteOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(collegeName.equals("amcec")){
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amcec/");
                    intent.putExtra("topic", "AMC Engineering College");
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.amcgroup.edu.in/amc/");
                    intent.putExtra("topic", "AMC Management College");
                    startActivity(intent);
                }

            }
        };
        collegeWebsiteTextView.setOnClickListener(collegeWebsiteOnClickListener);
        collegeWebsiteCard.setOnClickListener(collegeWebsiteOnClickListener);
//***********************************************************


        View.OnClickListener collegeSocialMediaOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), SocialMediaActivity.class);
                    startActivity(intent);

            }
        };
        collegeSocialMediaTextView.setOnClickListener(collegeSocialMediaOnClickListener);
        collegeSocialCard.setOnClickListener(collegeSocialMediaOnClickListener);
//***********************************************************


    }



}