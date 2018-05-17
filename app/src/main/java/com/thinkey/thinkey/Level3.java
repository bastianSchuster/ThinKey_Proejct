package com.thinkey.thinkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * @author Bastian Schuster
 * @version 2018-05-17
 *
 */
public class Level3 extends AppCompatActivity {

    private Button falsch1,falsch2,falsch3,richtig;

    Button b;
    ImageButton pause;
    TextView tvhighscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);


        final Bundle EXTRAS = getIntent().getExtras();
        tvhighscore = (TextView) findViewById(R.id.highscore_label_2);
        tvhighscore.setText("Points: " + EXTRAS.getInt("Points"));

        b = (Button) findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level3.this,MainActivity.class);
                startActivity(i);
            }
        });

        this.pause=(ImageButton)findViewById(R.id.pause);
        this.pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level3.this,Pause.class);
                i.putExtra("Points", 20);
                startActivity(i);
            }
        });





        this.falsch1=(Button) findViewById(R.id.falsch1);
        this.falsch2=(Button) findViewById(R.id.falsch2);
        this.falsch2=(Button) findViewById(R.id.falsch2);
        this.richtig=(Button) findViewById(R.id.richtig);

        this.falsch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Level3.this,Highscore.class);
                i.putExtra("Points", EXTRAS.getInt("Points") - 10);
                startActivity(i);
            }
        });

        this.falsch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Level3.this,Highscore.class);
                i.putExtra("Points",EXTRAS.getInt("Points")-10);
                startActivity(i);

            }
        });

        this.falsch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Level3.this,Highscore.class);
                i.putExtra("Points", EXTRAS.getInt("Points") - 10);
                startActivity(i);

            }
        });

        this.richtig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(Level3.this,Highscore.class);
                i.putExtra("Points", EXTRAS.getInt("Points") + 10);
                startActivity(i);

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
