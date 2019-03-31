package com.example.marseilleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    val language = arrayListOf<String>("German", "French", "English", "Spanish")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO (01) Add an info level log statement here
        Log.i("MainActivity", "onCreate called")

        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.front_text)

        val listView = findViewById<ListView>(R.id.lang_screen_view)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, language)

        listView.adapter = adapter

        listView.setOnItemClickListener{ parent, view, position, id ->

            val intent = Intent(this, Player::class.java)

            if( position == 0 ) {
                startActivity(intent)
            }
            if( position == 1 ) {
                startActivity(intent)
            }
            if( position == 2 ) {
                startActivity(intent)
            }
            if( position == 3 ) {
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called")
    }
}
