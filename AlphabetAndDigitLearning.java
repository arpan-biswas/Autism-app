package com.example.shuvo.autismtherapy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlphabetAndDigitLearning extends AppCompatActivity {

    Button ea, ed, ba, bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_digit);

        ea = (Button) findViewById(R.id.buttonEA);
        ed = (Button) findViewById(R.id.buttonED);
        ba = (Button) findViewById(R.id.buttonBA);
        bd = (Button) findViewById(R.id.buttonBD);

        ea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(AlphabetAndDigitLearning.this, EngAlphabets.class);
                startActivity(i);
            }
        });

        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(AlphabetAndDigitLearning.this, EngDigits.class);
                startActivity(j);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent k = new Intent(AlphabetAndDigitLearning.this, BanAlphabets.class);
                startActivity(k);
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent l = new Intent(AlphabetAndDigitLearning.this, BanDigits.class);
                startActivity(l);
            }
        });
    }
}
