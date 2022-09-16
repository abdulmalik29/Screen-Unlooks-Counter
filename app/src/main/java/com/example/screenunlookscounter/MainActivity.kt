package com.example.screenunlookscounter

import android.content.Intent
import android.os.Bundle
//import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeUi()
    }

    private fun getScreenOnCount(): Int {
        val action = intent.action
//        Log.d("SLC", "Action: $action")

        var screenOnCount = 0

        when (action) {
            Intent.ACTION_SCREEN_ON -> {
                screenOnCount += 1
//                Log.d("SLC", "Screen On Count: $screenOnCount")
            }
            else -> {
            }
        }

        return screenOnCount
    }


    private fun initializeUi() {
        // When button is clicked, instantiate a Quote and add it to DB through the ViewModel
        findViewById<Button>(R.id.buttonShowStat).setOnClickListener {
//            getScreenOnCount()
            findViewById<TextView>(R.id.Stat).text = getScreenOnCount().toString()
        }
    }
}