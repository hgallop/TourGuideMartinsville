package com.example.android.visitmartinsville;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by doyou on 2/23/2018.
 */

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList playOptions = new ArrayList();

        playOptions.add(getResources().getString(R.string.motor));
        playOptions.add(getResources().getString(R.string.family));
        playOptions.add(getResources().getString(R.string.out));
        playOptions.add(getResources().getString(R.string.publicland));
        playOptions.add(getResources().getString(R.string.smith));
        playOptions.add(getResources().getString(R.string.run));
        playOptions.add(getResources().getString(R.string.cycle));
        playOptions.add(getResources().getString(R.string.sport));
        playOptions.add(getResources().getString(R.string.golf));
        playOptions.add(getResources().getString(R.string.stable));
        playOptions.add(getResources().getString(R.string.club));
        playOptions.add(getResources().getString(R.string.fest));

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item, R.id.play_option, playOptions);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list_view);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);

    }
}
