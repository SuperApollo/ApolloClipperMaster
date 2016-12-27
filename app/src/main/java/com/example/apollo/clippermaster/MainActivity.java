package com.example.apollo.clippermaster;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // start clipboard service
        Intent serviceIntent = new Intent(this, ClipboardService.class);
        startService(serviceIntent);
    }
}
