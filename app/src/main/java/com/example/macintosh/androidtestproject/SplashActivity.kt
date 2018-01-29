package com.example.macintosh.androidtestproject;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Created by macintosh on 1/27/18.
 */

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState);

        val intent = Intent(this@SplashActivity,MainActivity::class.java);

        /*
            FORMA #02 Establecer un contrato mediante Companion Object
            https://medium.com/@passsy/starting-activities-with-kotlin-my-journey-8b7307f1e460

            FORMA #01 de pasar valores de SplashActivity -> MainActivity
            usar el método putExtra en Splash:
        */

        //intent.putExtra("welcomeMsg", "Welcome New User");
        //intent.putExtra("userCounter", 1);
        startActivity(intent);
        finish();

    }

}
