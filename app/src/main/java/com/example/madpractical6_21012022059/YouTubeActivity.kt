package com.example.madpractical6_21012022059

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        val web=findViewById<WebView>(R.id.web)
        val mybuttonview=findViewById<FloatingActionButton>(R.id.playbtn1)
        val youtubrId="kBdlM6hNDAE"
        
        val webSettings=web.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        web.loadUrl("https://www.youtube.com/embed/"+youtubrId)
        mybuttonview.setOnClickListener{
            Intent(this,YouTubeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}