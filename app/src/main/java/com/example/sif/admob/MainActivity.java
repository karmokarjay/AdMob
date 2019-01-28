package com.example.sif.admob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bannedAdd = findViewById(R.id.tv_banner_name);
        TextView interstitialAdd = findViewById(R.id.tv_interstitial_name);
        TextView rewardVideoAdd = findViewById(R.id.tv_rewarded_video_name);

        bannedAdd.setOnClickListener(this);
        interstitialAdd.setOnClickListener(this);
        rewardVideoAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_banner_name:
                Intent intent = new Intent(this, BannerAddActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_interstitial_name:
                Intent intent1 = new Intent(this, InterstitialAddActivity.class);
                startActivity(intent1);
                break;
            case R.id.tv_rewarded_video_name:
                Intent intent2 = new Intent(this, RewardVideoActivity.class);
                startActivity(intent2);
                break;
        }

    }
}
