package com.example.android.visitmartinsville;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by doyou on 2/23/2018.
 */

public class StayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<String> stayOptions = new ArrayList<>();

        stayOptions.add(getResources().getString(R.string.hotels));
        stayOptions.add(getResources().getString(R.string.b_and_b));
        stayOptions.add(getResources().getString(R.string.c_and_c));
        stayOptions.add(getResources().getString(R.string.camp));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(StayActivity.this, R.layout.list_item, R.id.play_option, stayOptions);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list_view);

        listView.setBackgroundColor(getResources().getColor(R.color.backgroundList));

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }
}
