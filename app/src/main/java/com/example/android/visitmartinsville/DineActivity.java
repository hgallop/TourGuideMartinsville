package com.example.android.visitmartinsville;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by doyou on 2/23/2018.
 */

public class DineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<String> dineOptions = new ArrayList<>();

        dineOptions.add(getResources().getString(R.string.cafes));
        dineOptions.add(getResources().getString(R.string.amer_cuis));
        dineOptions.add(getResources().getString(R.string.asian));
        dineOptions.add(getResources().getString(R.string.deli));
        dineOptions.add(getResources().getString(R.string.bbq));
        dineOptions.add(getResources().getString(R.string.italian));
        dineOptions.add(getResources().getString(R.string.mexi));
        dineOptions.add(getResources().getString(R.string.southern));
        dineOptions.add(getResources().getString(R.string.sea_steak));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(DineActivity.this, R.layout.list_item, R.id.play_option, dineOptions);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list_view);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }
}