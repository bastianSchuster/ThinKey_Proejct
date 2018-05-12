package com.thinkey.thinkey;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Level1_logik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_logik);

        Button richtig = (Button) findViewById(R.id.richtig_8);
        richtig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRichtig = new Intent(Level1_logik.this,WinnerScreen.class);
                startActivity(intentRichtig);
            }
        });

        Button falsch1 = (Button) findViewById(R.id.falsch_11);
        falsch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFalsch1 = new Intent(Level1_logik.this, GameOver.class);
                startActivity(intentFalsch1);
            }
        });

        Button falsch2 = (Button) findViewById(R.id.falsch_12);
        falsch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFalsch2 = new Intent(Level1_logik.this, GameOver.class);
                startActivity(intentFalsch2);
            }
        });

        Button falsch3 = (Button) findViewById(R.id.falsch_16);
        falsch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFalsch3 = new Intent(Level1_logik.this, GameOver.class);
                startActivity(intentFalsch3);
            }
        });

        View decorView = getWindow().getDecorView();

        decorView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE);


    }

}
