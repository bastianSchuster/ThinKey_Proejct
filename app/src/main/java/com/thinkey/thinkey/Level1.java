package com.thinkey.thinkey;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class
Level1 extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private TextView countDown;
    private long timeLeftMilliSeconds = 30000; //30 seconds
    private ImageButton btn;
    private Button schwarz,rot;
    TextView tvhighscore;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        countDown = (TextView) findViewById(R.id.level_1_timer);

        schwarz=(Button) findViewById(R.id.Schwarz);
        rot=(Button) findViewById(R.id.Rot);
        tvhighscore = (TextView) findViewById(R.id.highscore_label_1);

        tvhighscore.setText("Points: 0");

        schwarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Level1.this, Level2.class);
                intent.putExtra("Points", 10);
                startActivity(intent);

            }
        });
        rot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level1.this, Level2.class);
                intent.putExtra("Points", -10);
                startActivity(intent);
            }
        });

        btn=(ImageButton) findViewById(R.id.pause);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, Pause.class);
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

        startCountDown();

    }

    public void startCountDown() {

        countDownTimer = new CountDownTimer(timeLeftMilliSeconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftMilliSeconds = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {

            }
        }.start();

    }

    public void updateCountDownText() {

        countDown = (TextView) findViewById(R.id.level_1_timer);

        int seconds = (int) timeLeftMilliSeconds / 1000;
        countDown.setText(String.valueOf(seconds));

        if (timeLeftMilliSeconds < 10000) {
            countDown.setTextColor(Color.RED);
        } else {
            countDown.setTextColor(Color.WHITE);
        }

    }

}
