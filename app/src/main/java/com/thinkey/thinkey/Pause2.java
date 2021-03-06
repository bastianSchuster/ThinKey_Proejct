package com.thinkey.thinkey;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import java.util.Set;
import java.util.logging.Level;


/**
 * @author Bastian Schuster
 * @version 2018-05-17
 *
 */

public class Pause2 extends Activity {

    private Button continueb,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause2);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width= dm.widthPixels;
        int height= dm.heightPixels;
        getWindow().setLayout((int)(width),(int)(height*1.2));


        View decor = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decor.setSystemUiVisibility(uiOptions);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE);


        this.continueb= (Button) findViewById(R.id.continuebutton);
        this.continueb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pause2.this,Level2.class);
                i.putExtra("Points", 10);
                startActivity(i);
            }
        });



        this.home = (Button) findViewById(R.id.home);
        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pause2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
