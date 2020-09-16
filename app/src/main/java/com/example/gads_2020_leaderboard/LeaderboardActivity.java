package com.example.gads_2020_leaderboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class LeaderboardActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        mToolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(mToolbar);
    }
}