package com.proton.ecg.calculatehrdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.proton.ecg.calculatehr.callback.CalculateHrResultListener;
import com.proton.ecg.calculatehr.util.CalculateAlgorithmHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int filterType = 0;
        byte[] data = new byte[0];
        int sample = 256;
        CalculateAlgorithmHelper.getInstance().calculateHR(data, filterType, sample, new CalculateHrResultListener() {
            @Override
            public void onCalculateHR(int i) {
                //心率
            }
        });

    }
}