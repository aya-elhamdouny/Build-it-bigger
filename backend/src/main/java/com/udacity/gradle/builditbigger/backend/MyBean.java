package com.udacity.gradle.builditbigger.backend;

import com.example.javajokes.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {
    private Jokes jokesLib= new Jokes();
    public String getJoke(){
        return jokesLib.getRandomJoke();
    }
}