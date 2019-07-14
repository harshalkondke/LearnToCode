package oopm.java.program;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DesActivity extends AppCompatActivity {

    private Bundle extras;
    private static final String TAG = "DesActivity";
    private Context context;
    private WebView webview1;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des);

        context = DesActivity.this;
        webview1 = (WebView) findViewById(R.id.web_view);
        extras = getIntent().getExtras();
        if(!extras.equals(null)){
            String data = extras.getString("titles");

            Log.d(TAG,"onCreate: the comming data is "+data);

            String url = "file:///android_asset/"+data+".html";
            webview1.loadUrl(url);

           WebSettings webSettings = webview1.getSettings();

           webSettings.setBuiltInZoomControls(true);
           webSettings.setDisplayZoomControls(false);
           webSettings.setJavaScriptEnabled(false);


        }

        MobileAds.initialize(this ,"ca-app-pub-2724342829182540~5075051334");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
