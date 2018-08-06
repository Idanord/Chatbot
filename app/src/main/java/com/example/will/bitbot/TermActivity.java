package com.example.will.bitbot;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;

import static android.R.layout.activity_list_item;

public class TermActivity extends Activity implements AdapterView.OnItemClickListener {

    private TextView termTextView; //individual view
    private ListView itemsListView; //list view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term);

        //connect to Database Activity

        termTextView = (TextView) findViewById(R.id.termTextView);
        itemsListView = (ListView) findViewById(R.id.itemsListView);

        itemsListView.setOnItemClickListener(this);

        //create key value pairs
        HashMap<String, String> itemsObject = new HashMap<String, String>();
        itemsObject.put("Term #1", "Definition #1");
        Log.d("Added: ", itemsObject + " item");
        itemsObject.put("Term #2", "Definition #2");
        Log.d("Added: ", itemsObject + " item");


        //enables dynamic list filling; takes context of the activity, type of list, and array
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.term_list_item,
                itemsObject
        );

        itemsListView.setAdapter(arrayAdapter);

        // new DownloadFeed().execute(); // inner class, within the same class file - for download threading

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //take the view and pass it into this
//        //take the current object's key, and then find the corresponding value
//        //put that into the resulting TextView object and open the TermActivity
//
    }


//    private class DownloadFeed extends AsyncTask<Void, Void, Void> { // force feed to run in own thread
//        @Override
//        protected Void doInBackground(Void... voids) {
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void result){
//            Log.d("News reader","Download feed");
//            new ReadFeed().execute();
//        }
//    }
//
//    private class ReadFeed extends AsyncTask <Void, Void, Void>{
//        public void execute(){
//        }
//
//        @Override
//        protected Void doInBackground(Void... voids){//return type of Void object since generic; takes many voids
//            feed = io.readFile();
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void result){
//            Log.d("News reader", "Feed read");
//
//            //update the display for the activity
//            ItemActivity.this.updateDisplay();
//        }
//    }
//
//    private void updateDisplay() {
//        if (feed == null) {
//            titleTextView.setText("Unable to get the feed.");
//            return;
//        }
//
//
//        titleTextView.setText(feed.getTitle());
//        ArrayList<RSSFeed> items = feed.getAllItems();
//
//        ArrayList<HashMap<String, String>> data = new ArrayList<>(); // array list that contains a hash map
//
//        for (RSSFeed item : items) { // hashmap iterator
//            HashMap<String, String> map = new HashMap<>();
//            map.put("date", item.getPubDateFormatted());
//            map.put("title", item.getTitle());
//            data.add(map);
//        }
//    }


}
