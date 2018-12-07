package com.example.simon.nuitdelinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionurgence(View view) {
        Intent urgenceActivityIntent = new Intent(MainActivity.this, UrgenceActivity.class);
        startActivity(urgenceActivityIntent);
    }


    public void Maps(View view) {
        Intent mapsIntent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(mapsIntent);
    }
}
