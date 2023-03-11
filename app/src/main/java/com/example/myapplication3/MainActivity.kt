package com.example.myapplication3

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.w("MyApp", "MainActivity onCreate() called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val firstButton = findViewById<View>(R.id.first_button) as Button

        firstButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, DetailActivity::class.java))
        }

        val secondButton = findViewById<View>(R.id.second_button) as Button
        secondButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://mobimg.b-cdn.net/v3/fetch/fe/fe22186dba2df35f07573604aa8a0e63.jpeg?w=1470&r=0.5625"));
            startActivity(intent)
        }

        val thirdButton = findViewById<View>(R.id.third_button) as Button

        thirdButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, TaskActivity::class.java))
        }

    }

    override fun onStart() {
        Log.w("MyApp", "MainActivity onStart() called");
        super.onStart()

    }

    override fun onResume() {
        Log.w("MyApp", "MainActivity onResume() called");
        super.onResume()
    }

    override fun onPause() {
        Log.w("MyApp", "MainActivity onPause() called");
        super.onPause()
    }

    override fun onStop() {
        Log.w("MyApp", "MainActivity onStop() called");
        super.onStop()
    }

    override fun onDestroy() {
        Log.w("MyApp", "MainActivity onDestroy() called");
        super.onDestroy()
    }
}