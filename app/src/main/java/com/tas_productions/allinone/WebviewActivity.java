package com.tas_productions.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebviewActivity extends AppCompatActivity {
WebView webView;
Bundle extras;
Button home;
int app_play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        extras = getIntent().getExtras();
        home = findViewById(R.id.homeButtonID);
        webView = findViewById(R.id.webViewID);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        app_play = extras.getInt("app");
        loadURL(app_play);
        webView.setWebViewClient(new WebViewClient());
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WebviewActivity.this,MainActivity.class));
                finish();
            }
        });
    }


    int loadURL(int play)
    {
        switch (play) {
            case 1:
                webView.loadUrl("https://www.amazon.in/");
                break;
            case 2:
                webView.loadUrl("https://www.flipkart.com/");
                break;
            case 3:
                webView.loadUrl("https://m.snapdeal.com/");
                break;
            case 4:
                webView.loadUrl("https://m.clubfactory.com/home");
                break;
            case 5:
                webView.loadUrl("https://medium.com/");
                break;
            case 6:
                webView.loadUrl("https://m.facebook.com/");
                break;
            case 7:
                webView.loadUrl("https://www.instagram.com/");
                break;
            case 8:
                webView.loadUrl("https://mobile.twitter.com/");
                break;
            case 9:
                webView.loadUrl("https://www.quora.com/");
                break;
            case 10:
                webView.loadUrl("https://www.tiktok.com/");
                break;
            case 11:
                webView.loadUrl("https://m.youtube.com/");
                break;
            case 12:
                webView.loadUrl("https://www.zomato.com/akola");
                break;
            case 13:
                webView.loadUrl("https://www.swiggy.com/");
                break;
            case 14:
                webView.loadUrl("https://www.reddit.com/");
                break;
            case 15:
                webView.loadUrl("https://www.illuminatiofficial.org/");
                break;
            case 16:
                webView.loadUrl("https://www.pinterest.com/");
                break;

            case 17:
                webView.loadUrl("https://www.olacabs.com/");
                break;

            case 18:
                webView.loadUrl("https://www.olx.in/");
                break;

            case 19:
                webView.loadUrl("https://m.imdb.com/");
                break;

            case 20:
                webView.loadUrl("https://byjus.com/");
                break;

            case 21:
                webView.loadUrl("https://www.udemy.com/");
                break;

            case 22:
                webView.loadUrl("https://www.uber.com/in/en/");
                break;

            case 23:
                webView.loadUrl("https://www.makemytrip.com/");
                break;

            case 24:
                webView.loadUrl("https://www.khanacademy.org/");
                break;

            case 25:
                webView.loadUrl("https://unacademy.com/");
                break;
            case 26:
                webView.loadUrl("https://www.netflix.com/in/");
                break;
            case 27:
                webView.loadUrl("https://www.oyorooms.com/");
                break;
            case 28:
                webView.loadUrl("https://www.coursera.org/");
                break;
            case 29:
                webView.loadUrl("https://www.hackerrank.com/");
                break;
            case 30:
                webView.loadUrl("https://www.linkedin.com/");
                break;
        }
        return 0;
    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
