package com.example.amccollege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class WebsiteActivity extends AppCompatActivity {


    WebView webView;
    SwipeRefreshLayout swipeRefreshLayout;
    ImageView imageView;
    TextView collegeNameTextView;
    ProgressBar progressBar;
    String currentUrl;
    String topicName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);

        currentUrl = getIntent().getExtras().getString("url");
        topicName = getIntent().getExtras().getString("topic");

        getSupportActionBar().hide();

        //String[] college = currentUrl.split("/");
        //String collegeName = college[college.length - 1];
        setTitle(topicName);

        setContentView(R.layout.activity_website);


        webView = (WebView) findViewById(R.id.webView);
        swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout);
        imageView = (ImageView)findViewById(R.id.imageView);
        collegeNameTextView = (TextView)findViewById(R.id.collegeNameTextView);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        collegeNameTextView.setText(topicName);

        webView.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view, int progress){
                progressBar.setProgress(progress * 100);
            }

        });

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.GONE);
                collegeNameTextView.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                Objects.requireNonNull(getSupportActionBar()).setLogo(R.drawable.logo);
                getSupportActionBar().show();
                swipeRefreshLayout.setRefreshing(false);

                if(topicName.equals("Dhi Login")) {

                    //do nothing

                }else if (topicName.equals("AMC Engineering College") || topicName.equals("AMC Management College")){
                    //do nothing
                }
                else if(topicName.equals("AMC Notice")) {

                    webView.loadUrl("javascript:(function(){" +
                            "document.getElementsByTagName('section')[3].remove();" +
                            "document.getElementsByTagName('section')[2].remove();" +
                            "document.getElementById('main-features').remove();" +
                            "document.getElementById('example-1').remove();" +
                            "})()");

                    webView.loadUrl("javascript:(function(){" +
                            "document.querySelectorAll('section > div > div > div')[0].remove();" +
                            "document.querySelectorAll('nav')[0].remove();" +
                            "document.querySelectorAll('section > div > div > aside > div > div')[3].remove();"  +
                            "document.querySelectorAll('section > div > div > aside > div > div')[2].remove();"  +
                            "document.querySelectorAll('section > div > div > aside > div > div')[1].remove();"  +
                            "document.getElementsByTagName(\"marquee\")[0].outerHTML = document.getElementsByTagName(\"marquee\")[0].outerHTML.replace(/marquee/g,\"div\");" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('jssor_1');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var head = document.getElementsByTagName('header')[0];"
                            + "head.parentNode.removeChild(head);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var foot = document.getElementsByTagName('footer')[0];"
                            + "foot.parentNode.removeChild(foot);" +
                            "})()");



                }else if(topicName.equals("AMCEC Notice")) {

                    webView.loadUrl("javascript:(function(){" +
                            "document.getElementsByTagName('section')[3].remove();" +
                            "document.getElementsByTagName('section')[2].remove();" +
                            "document.getElementsByTagName('section')[0].remove();" +
                            "document.getElementById('main-features').remove();" +
                            "document.getElementById('example-1').remove();" +

                            "})()");

                    webView.loadUrl("javascript:(function(){" +
                            "document.querySelectorAll('section > div > div > div')[0].remove();" +
                            "document.querySelectorAll('nav')[0].remove();" +
                            "document.querySelectorAll('section > div > div > aside > iframe ')[0].remove();"  +
                            "document.querySelectorAll('section > div > div > aside > div ')[2].remove();"  +
                            "document.querySelectorAll('section > div > div > aside > div ')[1].remove();"  +
                            "document.querySelectorAll('section > div > div > aside > div ')[0].remove();"  +
                            "document.getElementsByTagName(\"marquee\")[0].outerHTML = document.getElementsByTagName(\"marquee\")[0].outerHTML.replace(/marquee/g,\"div\");" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('testimonials');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('jssor_1');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var head = document.getElementsByTagName('header')[0];"
                            + "head.parentNode.removeChild(head);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var foot = document.getElementsByTagName('footer')[0];"
                            + "foot.parentNode.removeChild(foot);" +
                            "})()");





                }else if(topicName.equals("Placements")){

                    webView.loadUrl("javascript:(function() { " +
                            "var head = document.getElementsByTagName('header')[0];"
                            + "head.parentNode.removeChild(head);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var foot = document.getElementsByTagName('footer')[0];"
                            + "foot.parentNode.removeChild(foot);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('testimonials');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('toTop');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('sub-header');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

//                    webView.loadUrl("javascript:(function() { " +
//                            "var con = document.getElementsByTagName('aside')[0];"
//                            + "con.parentNode.removeChild(con);" +
//                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementsByClassName('breadcrumb')[0];"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementsByTagName('marquee')[0];"
                            + "con.parentNode.parentNode.parentNode.removeChild(con.parentNode.parentNode);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('example-1');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");




                }else{

                    webView.loadUrl("javascript:(function() { " +
                            "var head = document.getElementsByTagName('header')[0];"
                            + "head.parentNode.removeChild(head);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var foot = document.getElementsByTagName('footer')[0];"
                            + "foot.parentNode.removeChild(foot);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('testimonials');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('toTop');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('sub-header');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementsByTagName('aside')[0];"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementsByClassName('breadcrumb')[0];"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementsByTagName('marquee')[0];"
                            + "con.parentNode.parentNode.parentNode.removeChild(con.parentNode.parentNode);" +
                            "})()");

                    webView.loadUrl("javascript:(function() { " +
                            "var con = document.getElementById('example-1');"
                            + "con.parentNode.removeChild(con);" +
                            "})()");

//                webView.loadUrl("javascript:(function() { " +
//                        "var con =  document.getElementsByTagName('section')[2];"
//                        + "con.parentNode.removeChild(con);" +
//                        "})()");
                }
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Log.i("current  url: ",currentUrl);
               // Toast.makeText(getApplicationContext(), "no internet" , Toast.LENGTH_SHORT).show();

            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                currentUrl = request.getUrl().toString();
                return super.shouldOverrideUrlLoading(view, request);

            }

        });


        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                webView.loadUrl(currentUrl);
            }
        });


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webView.loadUrl(currentUrl);

    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();
        }else{
            finish();
        }
    }


    //    private boolean exit=false;
//    @Override
//    public void onBackPressed() {
//        if(webView.canGoBack()){
//            webView.goBack();
//        }else {
//
//            if(exit){
//                finish();
//            }else{
//                Toast.makeText(this, "Press Again to Exit..", Toast.LENGTH_SHORT).show();
//            }
//
//            Timer timer = new Timer();
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    exit=false;
//                }
//            }, 2000);
//
//            exit=true;
//        }
//    }

}