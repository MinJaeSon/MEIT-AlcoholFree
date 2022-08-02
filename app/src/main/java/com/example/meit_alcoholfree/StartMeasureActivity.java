package com.example.meit_alcoholfree;

import android.Manifest;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import org.w3c.dom.Text;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;
import app.akexorcist.bluetotohspp.library.BluetoothState;
import app.akexorcist.bluetotohspp.library.DeviceList;

public class StartMeasureActivity extends AppCompatActivity {
    ImageView startBtn;
    TextView startTv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_start);

        startBtn = (ImageView) findViewById(R.id.measure_start_iv);
        startTv = (TextView) findViewById(R.id.measure_start_tv);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTv.setText("측정 중...");
                measured();
            }
        });
    }

    public void measured() {
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(StartMeasureActivity.this, CompleteMeasureActivity.class);
                startActivity(intent);
                finish();
            }
        }, 10000);
    }

}