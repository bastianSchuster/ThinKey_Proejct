package com.thinkey.thinkey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {

    private RadioButton rot;
    private RadioButton blau;
    private RadioButton gruen;
    private RadioButton schwarz;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        rot= (RadioButton) findViewById(R.id.rot);
        blau= (RadioButton) findViewById(R.id.blau);
        gruen= (RadioButton) findViewById(R.id.gruen);
        schwarz= (RadioButton) findViewById(R.id.schwarz);
        btn= (Button) findViewById(R.id.confirm);





        rot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blau.isChecked()){
                    blau.setChecked(false);
                }
                if(gruen.isChecked()){
                    gruen.setChecked(false);
                }
                if(schwarz.isChecked()){
                    schwarz.setChecked(false);
                }
            }
        });
        blau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rot.isChecked()){
                    rot.setChecked(false);
                }
                if(gruen.isChecked()){
                    gruen.setChecked(false);
                }
                if(schwarz.isChecked()){
                    schwarz.setChecked(false);
                }
            }
        });
        gruen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blau.isChecked()){
                    blau.setChecked(false);
                }
                if(rot.isChecked()){
                    rot.setChecked(false);
                }
                if(schwarz.isChecked()){
                    schwarz.setChecked(false);
                }
            }
        });
        schwarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blau.isChecked()){
                    blau.setChecked(false);
                }
                if(gruen.isChecked()){
                    gruen.setChecked(false);
                }
                if(rot.isChecked()){
                    rot.setChecked(false);
                }
            }
        });


        Button confirm=(Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blau.isChecked()){
                    Toast.makeText(getApplicationContext(),"Richtig",Toast.LENGTH_SHORT).show();
                }
                if(rot.isChecked()){
                    Toast.makeText(getApplicationContext(),"Falsch",Toast.LENGTH_SHORT).show();
                }
                if(gruen.isChecked()){
                    Toast.makeText(getApplicationContext(),"Falsch",Toast.LENGTH_SHORT).show();
                }
                if(schwarz.isChecked()){
                    Toast.makeText(getApplicationContext(),"Falsch",Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button back =(Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });



    }




    public void openActivity(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
