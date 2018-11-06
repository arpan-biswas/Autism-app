package com.example.shuvo.autismtherapy;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayAndLearn extends AppCompatActivity {


    Button ib, ih, ic, jc, jt, jh, kt, kb, kc, lh, lc, lb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_and_learn);

        ib = (Button) findViewById(R.id.buttonBB);
        ih = (Button) findViewById(R.id.buttonBH);
        ic = (Button) findViewById(R.id.buttonBC);

        jc = (Button) findViewById(R.id.buttonHC);
        jt = (Button) findViewById(R.id.buttonHT);
        jh = (Button) findViewById(R.id.buttonHH);

        kt = (Button) findViewById(R.id.buttonTT);
        kb = (Button) findViewById(R.id.buttonTB);
        kc = (Button) findViewById(R.id.buttonTC);

        lh = (Button) findViewById(R.id.buttonCH);
        lc = (Button) findViewById(R.id.buttonCC);
        lb = (Button) findViewById(R.id.buttonCB);


        ib.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog, null);

                builder.setView(dialoglayout);
                builder.show();
            }


        });

        ih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        jc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        jt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        jh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog, null);

                builder.setView(dialoglayout);
                builder.show();
            }

        });

        kt.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog, null);

                builder.setView(dialoglayout);
                builder.show();
            }


        });

        kb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });

        lc.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog, null);

                builder.setView(dialoglayout);
                builder.show();
            }


        });

        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PlayAndLearn.this);




                //Yes Button
                builder.setPositiveButton("Return to Play", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(), "Worng Answer", Toast.LENGTH_LONG).show();

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog_wrong, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });
    }
}
