package com.androiddevs.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androiddevs.newsapp.R

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}
