package com.thinkey.thinkey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.View;
import android.widget.*;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txt =(TextView) findViewById(R.id.Headline);

        Button levels =  (Button) findViewById(R.id.levels);
        levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Levels",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(MainActivity.this,   Level1.class);
                startActivity(intent);
            }
        });

        ImageButton settings=(ImageButton) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_LONG).show();
                Intent intentSetting = new Intent (MainActivity.this,Settings.class);
                startActivity(intentSetting);
            }
        });
        
        ImageButton play= (ImageButton) findViewById(R.id.start);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"First Level",Toast.LENGTH_LONG).show();
                Intent intentLevel1= new Intent(MainActivity.this,Level1.class);
                startActivity(intentLevel1);
            }
        });
    }




}
