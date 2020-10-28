package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SocialMediaActivity extends AppCompatActivity {

    TextView facebookTextView;
    CardView facebookCard;
    TextView youtubeTextView;
    CardView youtubeCard;
    TextView flickrTextView;
    CardView flickrCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_social_media);

        facebookTextView = (TextView) findViewById(R.id.facebookTextView);
        facebookCard = (CardView) findViewById(R.id.facebookCard);
        youtubeTextView = (TextView) findViewById(R.id.youtubeTextView);
        youtubeCard = (CardView) findViewById(R.id.youtubeCard);
        flickrTextView = (TextView) findViewById(R.id.flickrTextView);
        flickrCard = (CardView) findViewById(R.id.flickrCard);

        //***********************************************************************


        View.OnClickListener facebookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                    intent.putExtra("url", "https://www.facebook.com/amcecbangalore/");
                    intent.putExtra("topic", "Facebook");
                    startActivity(intent);
            }
        };
        facebookTextView.setOnClickListener(facebookClickListener);
        facebookCard.setOnClickListener(facebookClickListener);
//***********************************************************************


        View.OnClickListener youtubeClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.youtube.com/amcecbangalore");
                intent.putExtra("topic", "Youtube");
                startActivity(intent);
            }
        };
        youtubeTextView.setOnClickListener(youtubeClickListener);
        youtubeCard.setOnClickListener(youtubeClickListener);
//***********************************************************************

        View.OnClickListener flickrClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
                intent.putExtra("url", "https://www.flickr.com/photos/amc_college/sets/");
                intent.putExtra("topic", "Flickr");
                startActivity(intent);
            }
        };
        flickrTextView.setOnClickListener(flickrClickListener);
        flickrCard.setOnClickListener(flickrClickListener);
//***********************************************************************


    }

}