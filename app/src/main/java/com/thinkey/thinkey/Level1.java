package com.thinkey.thinkey;

import android.content.Intent;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);





        //ImageButton red = (ImageButton) findViewById(R.id.imageButton);
        TextView text = (TextView) findViewById(R.id.textView);
        final  RadioButton r1= (RadioButton) findViewById(R.id.radioButton);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        final RadioButton r2= (RadioButton) findViewById(R.id.radioButton2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        final RadioButton r3= (RadioButton) findViewById(R.id.radioButton3);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        final RadioButton r4= (RadioButton) findViewById(R.id.radioButton4);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Falsch",Toast.LENGTH_SHORT).show();
                }
                if(r2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Richtig",Toast.LENGTH_SHORT).show();
                }
                if(r3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Falsch",Toast.LENGTH_SHORT).show();
                }
                if(r3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Falsch",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button back =(Button) findViewById(R.id.button2);
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
