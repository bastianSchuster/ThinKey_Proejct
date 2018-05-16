package com.thinkey.thinkey;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Highscore extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor preferencesEditor;

    int reachedPoints;
    final String KEY ="savePreferences";

    TextView tvHighscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);


        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE);

        tvHighscore = (TextView) findViewById(R.id.tvhighscore_label);


        Button b= (Button) findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Highscore.this,MainActivity.class);
                startActivity(i);
            }
        });

        this.preferences = this.getSharedPreferences("Highscore", MODE_PRIVATE);
        preferencesEditor = preferences.edit();

        Bundle extras = getIntent().getExtras();
        if (extras == null) {

            reachedPoints = 0;

        } else {

            reachedPoints = extras.getInt("Points");

        }

        showPoints();

    }

    private void showPoints() {

        if (preferences.getInt(KEY, 0) < reachedPoints) {

            tvHighscore.setText("NEW HIGHSCORE : " + reachedPoints);

            preferencesEditor.putInt(KEY, reachedPoints);

        } else {

            tvHighscore.setText("Points : " + reachedPoints);

        }

    }

    public void setReachedPoints(int points) {

        this.reachedPoints = points;

    }

}
