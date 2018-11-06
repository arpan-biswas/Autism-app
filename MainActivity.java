package com.example.shuvo.autismtherapy;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button at, pl, hc, lp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        at = (Button) findViewById(R.id.buttonAT);
        pl = (Button) findViewById(R.id.buttonPL);
        hc = (Button) findViewById(R.id.buttonHC);
        lp = (Button) findViewById(R.id.buttonLP);

        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, AutismTest.class);
                startActivity(i);
            }
        });

        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(MainActivity.this, PlayAndLearn.class);
                startActivity(j);
            }
        });

        hc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent k = new Intent(MainActivity.this, AlphabetAndDigitLearning.class);
                startActivity(k);
            }
        });

        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent l = new Intent(MainActivity.this, LocatePatient.class);
                startActivity(l);
            }
        });

    }
}
