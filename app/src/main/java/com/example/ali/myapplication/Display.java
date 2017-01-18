package com.example.ali.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ali on 17/01/2017.
 */

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayinfo);

        SharedPreferences sharedPreferences = getSharedPreferences("MYPREF" , MODE_PRIVATE);
        String display = sharedPreferences.getString("display" , " ");

        TextView displayinfo = (TextView) findViewById(R.id.txtShow);
        displayinfo.setText(display);
    }
}
