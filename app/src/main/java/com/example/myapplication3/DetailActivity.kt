package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.w("MyApp", "DetailActivity onCreate() called");
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

    }

    override fun onStart() {
        Log.w("MyApp", "DetailActivity onStart() called");
        super.onStart()

    }

    override fun onResume() {
        Log.w("MyApp", "DetailActivity onResume() called");
        super.onResume()
    }

    override fun onPause() {
        Log.w("MyApp", "DetailActivity onPause() called");
        super.onPause()
    }

    override fun onStop() {
        Log.w("MyApp", "DetailActivity onStop() called");
        super.onStop()
    }

    override fun onDestroy() {
        Log.w("MyApp", "DetailActivity onDestroy() called");
        super.onDestroy()
    }

}