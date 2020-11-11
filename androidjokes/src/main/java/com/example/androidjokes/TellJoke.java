package com.example.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TellJoke extends AppCompatActivity {
TextView tvJoke;
String joke;
    public final static String JOKE_INTENT="JOKE_INTENT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tell_joke);
        tvJoke= findViewById(R.id.tvShowJoke);
        joke=getIntent().getStringExtra(JOKE_INTENT);
        tvJoke.setText(joke);

    }
}
