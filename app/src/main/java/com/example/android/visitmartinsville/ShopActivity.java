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

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<String> shopOptions = new ArrayList<>();

        shopOptions.add(getResources().getString(R.string.antique));
        shopOptions.add(getResources().getString(R.string.gift));
        shopOptions.add(getResources().getString(R.string.cloths));
        shopOptions.add(getResources().getString(R.string.furniture));
        shopOptions.add(getResources().getString(R.string.specialty));
        shopOptions.add(getResources().getString(R.string.shops));
        shopOptions.add(getResources().getString(R.string.sporting));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ShopActivity.this, R.layout.list_item, R.id.play_option, shopOptions);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list_view);

        listView.setBackgroundColor(getResources().getColor(R.color.backgroundList));

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }
}
