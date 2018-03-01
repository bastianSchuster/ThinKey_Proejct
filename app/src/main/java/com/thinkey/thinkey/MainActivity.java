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

        final EditText txt =(EditText) findViewById(R.id.firstText);


        Button btn= (Button) findViewById(R.id.btn_play);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"First Level",Toast.LENGTH_LONG).show();
                openActivity();
                txt.setText("Test");
            }
        });
    }



    public void openActivity(){
        Intent intent= new Intent(this,Level1.class);
        startActivity(intent);
    }
}
