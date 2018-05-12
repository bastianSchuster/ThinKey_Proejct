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
                Intent intentLevel2 = new Intent(Levelauswahl.this, GameOver.class);
                startActivity(intentLevel2);
            }
        });

    }

}
