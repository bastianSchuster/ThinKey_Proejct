package com.thinkey.thinkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Levelauswahl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levelauswahl);

        Button level1 = (Button) findViewById(R.id.level1_button);
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLevel1 = new Intent(Levelauswahl.this, Level1_logik.class);
                startActivity(intentLevel1);
            }
        });

        Button level2 = (Button) findViewById(R.id.level2_button);
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLevel2 = new Intent(Levelauswahl.this, Level2.class);
                startActivity(intentLevel2);
            }
        });

        Button level3 = (Button) findViewById(R.id.level3_button);
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLevel3 = new Intent(Levelauswahl.this, Level3.class);
                startActivity(intentLevel3);
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
