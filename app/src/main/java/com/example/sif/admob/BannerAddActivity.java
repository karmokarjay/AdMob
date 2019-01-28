package com.example.sif.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BannerAddActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_add);


        /** Have your app initialize the Mobile Ads SDK with your AdMob App ID. */
        MobileAds.initialize(this, "ca-app-pub-6043887551067618~9044149108");

        adView = findViewById(R.id.ad_view_bottom_layout);
        AdRequest adRequest = new AdRequest.Builder()

                //Test Device is obtained in LogCat, this is used so that real ads can be seen without account getting banned.
                .addTestDevice(getResources().getString(R.string.test_device_id))
                .build();
        adView.loadAd(adRequest);
    }
}
