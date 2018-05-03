    package com.thinkey.thinkey;

    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.support.annotation.Nullable;
    import android.util.DisplayMetrics;
    import android.view.View;
    import android.widget.Button;

    public class WinnerScreen extends Activity{

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);



            setContentView(R.layout.winnerstyle);
            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);
            int width= dm.widthPixels;
            int height= dm.heightPixels;
            getWindow().setLayout((int)(width*.73),(int)(height*.31));

            Button btn= (Button) findViewById(R.id.next);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(WinnerScreen.this, Level2.class);
                    startActivity(i);
                }
            });
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }
