package com.thinkey.thinkey;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        Button btn= (Button) findViewById(R.id.confirm);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
