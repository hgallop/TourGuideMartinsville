package com.example.android.visitmartinsville;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by doyou on 2/23/2018.
 */

public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<String> exploreOptions = new ArrayList<>();

        exploreOptions.add(getResources().getString(R.string.smith_towns));
        exploreOptions.add(getResources().getString(R.string.art_studios));
        exploreOptions.add(getResources().getString(R.string.fairy));
        exploreOptions.add(getResources().getString(R.string.agri));
        exploreOptions.add(getResources().getString(R.string.genealogy));
        exploreOptions.add(getResources().getString(R.string.historic));
        exploreOptions.add(getResources().getString(R.string.cemeteries));
        exploreOptions.add(getResources().getString(R.string.sites));
        exploreOptions.add(getResources().getString(R.string.theatre));
        exploreOptions.add(getResources().getString(R.string.museums));
        exploreOptions.add(getResources().getString(R.string.music));
        exploreOptions.add(getResources().getString(R.string.pub_art));
        exploreOptions.add(getResources().getString(R.string.tours));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ExploreActivity.this, R.layout.list_item, R.id.play_option, exploreOptions);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list_view);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);

    }
}
