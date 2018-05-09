package com.thinkey.thinkey;

import android.content.Intent;
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

    }

}
