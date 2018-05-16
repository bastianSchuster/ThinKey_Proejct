package com.thinkey.thinkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level2 extends AppCompatActivity {

    Button correct,btn2,btn3,btn4;
    ImageButton pause;
    TextView tvhighscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        final Bundle EXTRAS = getIntent().getExtras();
        tvhighscore = (TextView) findViewById(R.id.highscore_label_2);
        tvhighscore.setText("Points: " + EXTRAS.getInt("Points"));

        this.pause = (ImageButton) findViewById(R.id.pause);
        correct = (Button) findViewById(R.id.btn2);
        btn2 = (Button) findViewById(R.id.btn);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);


        this.pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level2.this, Pause2.class);
                i.putExtra("Points", 10);
                startActivity(i);
            }
        });

        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level2.this, Highscore.class);
                intent.putExtra("Points", EXTRAS.getInt("Points") + 10);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level2.this,Highscore.class);
                intent.putExtra("Points", EXTRAS.getInt("Points") - 10);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level2.this, Highscore.class);
                intent.putExtra("Points", EXTRAS.getInt("Points") - 10);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level2.this, Highscore.class);
                intent.putExtra("Points", EXTRAS.getInt("Points") - 10);
                startActivity(intent);
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
