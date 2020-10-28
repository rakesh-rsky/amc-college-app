package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class AmcecCourseActivity extends AppCompatActivity {

    Spinner courseMain;
    Spinner courseSub;
    Spinner courseName;

    String courseMainText = "";
    String courseSubText = "";
    String courseNameText = "";

    ArrayAdapter<String> courseMainAdapter;
    ArrayAdapter<CharSequence> courseSubAdapter;
    ArrayAdapter<CharSequence> courseNameAdapter;

    Button courseSearchButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amcec_course);

        courseMain = (Spinner) findViewById(R.id.courseMain);
        courseSub = (Spinner) findViewById(R.id.courseSub);
        courseName = (Spinner) findViewById(R.id.courseName);

        courseSearchButton = (Button) findViewById(R.id.courseSearchButton);

        String[] items = new String[]{ "---select---", "Under Graduate", "Post Graduate", "Phd"};

        courseMainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        courseMainAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseMain.setAdapter(courseMainAdapter);


        courseMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0) {

                    courseSub.setVisibility(View.INVISIBLE);
                    courseName.setVisibility(View.INVISIBLE);

                }else if (i==1){

                    courseSubAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.ug_course_name, android.R.layout.simple_spinner_item);
                    courseSubAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSub.setAdapter(courseSubAdapter);
                    courseSub.setVisibility(View.VISIBLE);
                    courseName.setVisibility(View.INVISIBLE);

                }else if(i==2){

                    courseSubAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.pg_course_name, android.R.layout.simple_spinner_item);
                    courseSubAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSub.setAdapter(courseSubAdapter);
                    courseSub.setVisibility(View.VISIBLE);
                    courseName.setVisibility(View.INVISIBLE);


                }else if(i==3){

                    courseSub.setVisibility(View.INVISIBLE);
                    courseName.setVisibility(View.INVISIBLE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        courseSub.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    courseName.setVisibility(View.INVISIBLE);

                }else if(courseMain.getSelectedItem().equals("Under Graduate")){

                    if(i==1){
                        courseNameAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.be_course, android.R.layout.simple_spinner_item);
                        courseNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        courseName.setAdapter(courseNameAdapter);
                        courseName.setVisibility(View.VISIBLE);

                    }else if(i==2){
                        courseName.setVisibility(View.INVISIBLE);
                    }

                }else if (courseMain.getSelectedItem().equals("Post Graduate")){

                    if(i==1){
                        courseNameAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.mtech_course, android.R.layout.simple_spinner_item);
                        courseNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        courseName.setAdapter(courseNameAdapter);
                        courseName.setVisibility(View.VISIBLE);

                    }else if(i==2){
                        courseName.setVisibility(View.INVISIBLE);

                    }else if(i==3){
                        courseSubText = "MCA";
                        courseNameAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.mca_course, android.R.layout.simple_spinner_item);
                        courseNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        courseName.setAdapter(courseNameAdapter);
                        courseName.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        courseSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                 courseMainText = ((String)courseMain.getSelectedItem() == null ||  courseMain.getSelectedItem().toString().equals("---select---") ) ? "" : (String)courseMain.getSelectedItem() ;
//                 courseSubText = ((String)courseSub.getSelectedItem() == null) ||  courseSub.getSelectedItem().toString().equals("---select---") ? "" : (String)courseSub.getSelectedItem() ;
//                 courseNameText = ((String)courseName.getSelectedItem() == null) ||  courseName.getSelectedItem().toString().equals("---select---") ? "" : (String)courseName.getSelectedItem() ;
//
//                 courseMainText = (courseMain.getVisibility() == View.VISIBLE)? courseMainText : "";
//                courseSubText = (courseSub.getVisibility() == View.VISIBLE)? courseSubText : "";
//                courseNameText = (courseName.getVisibility() == View.VISIBLE)? courseNameText : "";

                boolean flag1 = (courseMain.getVisibility() == View.VISIBLE && courseMain.getSelectedItem().toString().equals("---select---")) ? false : true ;
                boolean flag2 = (courseSub.getVisibility() == View.VISIBLE && courseSub.getSelectedItem().toString().equals("---select---")) ? false : true ;
                boolean flag3 = (courseName.getVisibility() == View.VISIBLE && courseName.getSelectedItem().toString().equals("---select---")) ? false : true ;

                if(flag1 && flag2 && flag3){

                    courseMainText = (courseMain.getSelectedItem() != null ) ? courseMain.getSelectedItem().toString() : "";
                    courseSubText = (courseSub.getSelectedItem() != null ) ? courseSub.getSelectedItem().toString() : "";
                    courseNameText = (courseName.getSelectedItem() != null ) ? courseName.getSelectedItem().toString() : "";

                //    Toast.makeText(getApplicationContext(),courseMainText +": "+courseSubText +": "+courseNameText, Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);


                    if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==1){
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Best-Computer-Science-Engineering.php");
                        intent.putExtra("topic","Computer Science Engg.");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==2) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Top-Civil-Engineering-College.php");
                        intent.putExtra("topic","Civil Engineering");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==3) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Top-Electronics-and-Communication-College-In-Bangalore.php");
                        intent.putExtra("topic","Electronic & Communication");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==4) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Top-Electrical-Engineering-College-in-Bangalore.php");
                        intent.putExtra("topic","Electrical Engineering");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==5){
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/BE-Information-Science-and-Engineering.php");
                        intent.putExtra("topic","Information Science & Engg.");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==6) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Best-BE-Mechanical-Engineering-College.php");
                        intent.putExtra("topic","Mechanical Engineering");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==7) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Btech-mechatronics-engineering-in-bangalore.php");
                        intent.putExtra("topic","Mechatronics Engg.");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==8) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/artificial_intelligence_machine_learning.php");
                        intent.putExtra("topic","AI/ Machine Learning");

                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==9) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/aeronautical.php");
                        intent.putExtra("topic","Aeronautical");


                    }else if(courseMain.getSelectedItemPosition()==1 && courseSub.getSelectedItemPosition()==2 ) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/Chemistry.php");
                        intent.putExtra("topic","Department of Science & Humanity");


                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==1) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MTech_machinedesign_deatils.php");
                        intent.putExtra("topic","Machine Design");

                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==2){
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MTech_CS_deatils.php");
                        intent.putExtra("topic","Computer Science");

                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==3) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MTech_Digital_Electronics_Communication.php");
                        intent.putExtra("topic","Digital Electronics");

                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==4) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MTech_VLSI_Design_Embedded_Systems.php");
                        intent.putExtra("topic","VLSI Design");

                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==5) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MTech_CN_deatils.php");
                        intent.putExtra("topic","Computer Networks");

                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==1 && courseName.getSelectedItemPosition()==6) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MTech_Power_System.php");
                        intent.putExtra("topic","Power System");


                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==2) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MBA_deatils.php");
                        intent.putExtra("topic","MBA");


                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==3 && courseName.getSelectedItemPosition()==1) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MCA_deatils_2yr.php");
                        intent.putExtra("topic","MCA Lateral Entry");

                    }else if(courseMain.getSelectedItemPosition()==2 && courseSub.getSelectedItemPosition()==3 && courseName.getSelectedItemPosition()==2) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/MCA_deatils_3yr.php");
                        intent.putExtra("topic","MCA 3 Year Regular");


                    }else if(courseMain.getSelectedItemPosition()==3) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amcec/RandD_deatils.php");
                        intent.putExtra("topic","Ph.d");

                    }

                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Please select course", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}