package com.example.shuvo.autismtherapy;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LocatePatient extends AppCompatActivity implements LocationListener {

    EditText en, ec;
    Button ac;

    Button dc, sm, mc;
    TextView tc;
    String num;
    String name;

    SharedPreferences pref;
    String con_Info;

    double lat=0.0;
    double lon=0.0;

    String  msg;

    LocationManager locationManager;
    String mprovider;

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(num, null, msg, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Sending failed, Please Try Again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }

    @Override
    public void onLocationChanged(Location location) {
        lon = location.getLongitude();
        lat = location.getLatitude();
        msg = "I am in TROUBLE!!! PLEASE HELP ME at: "+"maps.google.com/maps?q=loc:"+lat+","+lon;
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_patient);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();

        mprovider = locationManager.getBestProvider(criteria, false);

        if (mprovider != null && !mprovider.equals("")) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            Location location = locationManager.getLastKnownLocation(mprovider);
            locationManager.requestLocationUpdates(mprovider, 15000, 1, this);

            if (location != null)
                onLocationChanged(location);
            else
                Toast.makeText(getBaseContext(), "No Location Provider Found Check Your Code", Toast.LENGTH_SHORT).show();
        }

        en = (EditText) findViewById(R.id.name);
        ec = (EditText) findViewById(R.id.contact);
        ac = (Button) findViewById(R.id.add);
        tc = (TextView) findViewById(R.id.contactInfo);
        dc = (Button) findViewById(R.id.delContact);
        sm = (Button) findViewById(R.id.sendMess);
        mc = (Button) findViewById(R.id.buttonMC);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder rp = new StringBuilder();
                SharedPreferences prefp = getSharedPreferences("contact_info", Context.MODE_PRIVATE);

                String con_name = en.getText().toString();
                String con_number = ec.getText().toString();



                rp.append("Name: "+con_name);
                rp.append("\nContact Number: "+con_number);
                rp.append("\nAdded !!!");

                SharedPreferences.Editor ep = prefp.edit();
                ep.putString("name",con_name);
                ep.putString("number",con_number);
                ep.apply();


                tc.setText(con_Info);

                Toast.makeText(getApplicationContext(),rp.toString(),Toast.LENGTH_LONG).show();

            }
        });

        pref = getSharedPreferences("contact_info", Context.MODE_PRIVATE);
        name = pref.getString("name","No Contact !!!");
        num = pref.getString("number","");

        con_Info = name +"\n"+num;

        tc.setText(con_Info);

        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tc.getText()=="No Contact !!!"){
                    Toast.makeText(getApplicationContext(),"Nothing To Delete",Toast.LENGTH_LONG).show();
                }

                else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(LocatePatient.this);

                    alert.setMessage("Do you want to remove the Contact?");
                    alert.setTitle("Contact will be removed !!");
                    alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getApplicationContext(), "Contact Removed", Toast.LENGTH_LONG).show();
                            getSharedPreferences("contact_info", 0).edit().clear().apply();
                            getSharedPreferences("name", 0).edit().clear().apply();
                            getSharedPreferences("number", 0).edit().clear().apply();
                            num = "";
                            name = "";
                            tc.setText("No Contact !!!");
                        }
                    });

                    alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });

                    alert.show();
                }
            }
        });


        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "")
                {
                    Toast.makeText(getApplicationContext(),"No Contact",Toast.LENGTH_LONG).show();
                }
                else{
                    if (ContextCompat.checkSelfPermission(LocatePatient.this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED)
                    {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(LocatePatient.this, Manifest.permission.SEND_SMS)) {
                        }
                        else {
                            ActivityCompat.requestPermissions(LocatePatient.this, new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SEND_SMS);
                        }
                    }

                    else if (ContextCompat.checkSelfPermission(LocatePatient.this, Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){

                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(num, null, msg, null, null);
                        Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

        mc.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                if(con_Info==""){

                    Toast.makeText(getApplicationContext(),"No Contact",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+num));
                    if (ActivityCompat.checkSelfPermission(LocatePatient.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(callIntent);
                }


            }
        });

    }



}
