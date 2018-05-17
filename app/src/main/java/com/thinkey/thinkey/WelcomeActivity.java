package com.thinkey.thinkey;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * @author Daniel Filipovic
 * @version 2018-05-17
 *
 */
public class WelcomeActivity extends AppCompatActivity {

    private TextView tl;
    private ImageView ti;
    private ProgressBar hprogressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE);

        hprogressBar = (ProgressBar) findViewById(R.id.progressBar);
        tl = (TextView) findViewById(R.id.thinkey_label);
        ti = (ImageView) findViewById(R.id.thinkey_image);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tl.startAnimation(myanim);
        ti.startAnimation(myanim);
        final Intent main = new Intent(this,MainActivity.class);
        new Thread(new Runnable() {


            public void run() {

                try {

                    loadProgress();
                    Thread.sleep(200);

                } catch (Exception e) {

                    e.printStackTrace();

                }

                finally {

                    startActivity(main);
                    finish();

                }

            }

        }).start();

    }

    private void loadProgress() {

        for (int progress = 0; progress <= 100; progress +=1) {

            try {

                Thread.sleep(40);
                hprogressBar.setProgress(progress);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }


}
