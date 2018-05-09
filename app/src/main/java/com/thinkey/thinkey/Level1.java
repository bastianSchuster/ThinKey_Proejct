package com.thinkey.thinkey;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {


    private Button btn;
    private Button schwarz,rot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);


        btn= (Button) findViewById(R.id.confirm);
        schwarz=(Button) findViewById(R.id.Schwarz);
        rot=(Button) findViewById(R.id.Rot);


        schwarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Level1.this, WinnerScreen.class);
                startActivity(intent);

            }
        });
        rot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level1.this, GameOver.class);
                startActivity(intent);
            }
        });

        Button back =(Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
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





    public void openActivity(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
