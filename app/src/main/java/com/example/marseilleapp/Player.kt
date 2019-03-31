package com.example.marseilleapp

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class Player : Application() {

    override fun onCreate() {
        super.onCreate()
        //setContentView(R.layout.activity_player)
        Timber.plant(Timber.DebugTree())
    }

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
    }*/
}
