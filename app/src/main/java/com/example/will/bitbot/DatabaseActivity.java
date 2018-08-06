package com.example.will.bitbot;

import android.app.Activity;
import android.os.Bundle;

public class DatabaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) im[;] {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        HashMap<String, String> hashMap= adapter.getItem(position);
        Intent intent = new Intent(SourceActivity.this, DestinationActivity.class);
        intent.putExtra("hashMap", hashMap);
        startActivity(intent);
    }
}
