package com.udacity.gradle.builditbigger.backend;

import com.example.javajokes.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v2",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    /** A simple endpoint that returns a joke*/
    @ApiMethod(name = "insertJoke")
    public MyBean insertJoke(MyBean response){
        //Jokes jokesLib= new Jokes();
        response.getJoke();
        return response;
    }
}
