package com.example.android.visitmartinsville;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView playText;
    TextView exploreText;
    TextView relaxText;
    TextView dineText;
    TextView shopText;
    TextView stayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playText = findViewById(R.id.play_view);
        exploreText = findViewById(R.id.explore_view);
        relaxText = findViewById(R.id.relax_view);
        dineText = findViewById(R.id.dine_view);
        shopText = findViewById(R.id.shop_view);
        stayText = findViewById(R.id.stay_view);

        //set a click listener to the numbers view
        playText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(numbersIntent);
            }
        });

        //set a click listener to the colors view
        exploreText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(colorsIntent);
            }
        });

        //set a click listener to the phrases view
        relaxText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent PhrasesIntent = new Intent(MainActivity.this, RelaxActivity.class);
                startActivity(PhrasesIntent);
            }
        });

        //set a click listener to the family members view
        dineText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent familyMembersIntent = new Intent(MainActivity.this, DineActivity.class);
                startActivity(familyMembersIntent);
            }
        });

        //set a click listener to the family members view
        shopText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent familyMembersIntent = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(familyMembersIntent);
            }
        });

        //set a click listener to the family members view
        stayText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent familyMembersIntent = new Intent(MainActivity.this, StayActivity.class);
                startActivity(familyMembersIntent);
            }
        });
    }
}
