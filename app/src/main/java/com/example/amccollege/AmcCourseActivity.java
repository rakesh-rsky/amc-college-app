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

public class AmcCourseActivity extends AppCompatActivity {

    Spinner amcCourseMain;
    Spinner amcCourseSub;

    String courseMainText = "";
    String courseSubText = "";

    ArrayAdapter<String> courseMainAdapter;
    ArrayAdapter<CharSequence> courseSubAdapter;


    Button amcCourseSearchButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amc_course);

        amcCourseMain = (Spinner) findViewById(R.id.amcCourseMain);
        amcCourseSub = (Spinner) findViewById(R.id.amcCourseSub);


        amcCourseSearchButton = (Button) findViewById(R.id.amcCourseSearchButton);

        String[] items = new String[]{ "---select---", "Under Graduate", "Post Graduate"};

        courseMainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        courseMainAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        amcCourseMain.setAdapter(courseMainAdapter);


        amcCourseMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0) {

                    amcCourseSub.setVisibility(View.INVISIBLE);

                }else if (i==1){

                    courseSubAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.amc_ug_course_name, android.R.layout.simple_spinner_item);
                    courseSubAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    amcCourseSub.setAdapter(courseSubAdapter);
                    amcCourseSub.setVisibility(View.VISIBLE);


                }else if(i==2){

                    courseSubAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.amc_pg_course_name, android.R.layout.simple_spinner_item);
                    courseSubAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    amcCourseSub.setAdapter(courseSubAdapter);
                    amcCourseSub.setVisibility(View.VISIBLE);


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        amcCourseSub.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        amcCourseSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                 courseMainText = ((String)courseMain.getSelectedItem() == null ||  courseMain.getSelectedItem().toString().equals("---select---") ) ? "" : (String)courseMain.getSelectedItem() ;
//                 courseSubText = ((String)courseSub.getSelectedItem() == null) ||  courseSub.getSelectedItem().toString().equals("---select---") ? "" : (String)courseSub.getSelectedItem() ;
//                 courseNameText = ((String)courseName.getSelectedItem() == null) ||  courseName.getSelectedItem().toString().equals("---select---") ? "" : (String)courseName.getSelectedItem() ;
//
//                 courseMainText = (courseMain.getVisibility() == View.VISIBLE)? courseMainText : "";
//                courseSubText = (courseSub.getVisibility() == View.VISIBLE)? courseSubText : "";
//                courseNameText = (courseName.getVisibility() == View.VISIBLE)? courseNameText : "";

                boolean flag1 = (amcCourseMain.getVisibility() == View.VISIBLE && amcCourseMain.getSelectedItem().toString().equals("---select---")) ? false : true ;
                boolean flag2 = (amcCourseSub.getVisibility() == View.VISIBLE && amcCourseSub.getSelectedItem().toString().equals("---select---")) ? false : true ;


                if(flag1 && flag2){

                    courseMainText = (amcCourseMain.getSelectedItem() != null ) ? amcCourseMain.getSelectedItem().toString() : "";
                    courseSubText = (amcCourseSub.getSelectedItem() != null ) ? amcCourseSub.getSelectedItem().toString() : "";


                    //    Toast.makeText(getApplicationContext(),courseMainText +": "+courseSubText +": "+courseNameText, Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);


                    if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==1 ){
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BBA.php");
                        intent.putExtra("topic","BBA");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==2) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BBA_Aviation_Management.php");
                        intent.putExtra("topic","BBA-Aviation Management");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==3) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BCom.php");
                        intent.putExtra("topic","B.Com");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==4) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/B.Com_Insurance_and_Acturial_Studies.php");
                        intent.putExtra("topic","B.com(Insurance & Acturial Studies)");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==5){
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/B.Com_Logistics_and_Supply_Chain_management.php");
                        intent.putExtra("topic","B.com(Logistics & Supply Chain Mgt.)");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==6) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BCA.php");
                        intent.putExtra("topic","BCA");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==7) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BHM.php");
                        intent.putExtra("topic","BHM");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==8) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BSc.php");
                        intent.putExtra("topic","B.Sc (Bio-Tech)");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==9) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BSc_Zoology.php");
                        intent.putExtra("topic","B.Sc (Zoology)");


                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==10 ) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BSc_Chemistry.php");
                        intent.putExtra("topic","B.Sc (Chemistry)");


                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==11) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BSc_Fashion_Apparel_Design.php");
                        intent.putExtra("topic","B.Sc (Fashion Apparel Design)");

                    }else if(amcCourseMain.getSelectedItemPosition()==1 && amcCourseSub.getSelectedItemPosition()==12){
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/BSc_Interior_Design_And_Decoration.php");
                        intent.putExtra("topic","B.Sc (Interior Design & Decoration)");

                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==1) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/MBA.php");
                        intent.putExtra("topic","MBA");

                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==2) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/MCA.php");
                        intent.putExtra("topic","MCA");

                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==3) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/M.Sc.php");
                        intent.putExtra("topic","M.Sc (Bio-Tech)");

                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==4) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/M.Sc_BC.php");
                        intent.putExtra("topic","M.Sc (Bio-Chemistry)");


                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==5) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/PG_Diploma_Ecommerce.php");
                        intent.putExtra("topic","PG Diploma E-Commerce");


                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==6) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/PG_Diploma_Retail_Management.php");
                        intent.putExtra("topic","PG Diploma Retail Mgt");

                    }else if(amcCourseMain.getSelectedItemPosition()==2 && amcCourseSub.getSelectedItemPosition()==7) {
                        intent.putExtra("url","https://www.amcgroup.edu.in/amc/PG_Diploma_Hospital_Administration.php");
                        intent.putExtra("topic","PG Diploma Hospital Administration");


                    }

                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Please select course", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}