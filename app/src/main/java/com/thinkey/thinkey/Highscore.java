package com.thinkey.thinkey;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        tvHighscore = (TextView) findViewById(R.id.tvhighscore_label);

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
