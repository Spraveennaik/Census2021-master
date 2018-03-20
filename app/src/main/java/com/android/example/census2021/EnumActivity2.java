package com.android.example.census2021;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

public class EnumActivity2 extends AppCompatActivity {

    private Button Admin;
    private Button Enumerator;
    private Button Entry;
    private Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enum2);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Enumerator = (Button)findViewById(R.id.EnButton);
        Admin = (Button)findViewById(R.id.AdButton);

        Entry = (Button)findViewById(R.id.button);

        Entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EnumActivity2.this,CensusActivity.class);
                startActivity(i);
            }
        });


    }
}
