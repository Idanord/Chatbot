package com.example.will.bitbot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class TermActivity extends Activity implements AdapterView.OnItemClickListener {

    private TextView termTextView;
    private ListView itemsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term);

        termTextView = (TextView) findViewById(R.id.termTextView);
        itemsListView = (ListView) findViewById(R.id.itemsListView);

        itemsListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //take the view and pass it into this

        //take the current object's key, and then find the corresponding value

        //put that into the resulting TextView object and open the TermActivity


        //hard code a hashmap with values to pull from
        //TODO need to fix this -
        // ArrayList<HashMap<String, String>> items = {"term1":"definition1"}; //hard-coding terms and definitions
    }


}
