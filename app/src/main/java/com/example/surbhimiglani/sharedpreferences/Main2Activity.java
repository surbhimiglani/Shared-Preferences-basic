package com.example.surbhimiglani.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView=(ImageView) findViewById(R.id.imageView);

        if(Path.getPath(getApplicationContext()).equals("1")){
            imageView.setImageResource(R.mipmap.arrow);
        }
        else if(Path.getPath(getApplicationContext()).equals("2")){
            imageView.setImageResource(R.mipmap.flower);
        }
        else if(Path.getPath(getApplicationContext()).equals("3")){
            imageView.setImageResource(R.mipmap.ic_launcher);
        }

    }
}
