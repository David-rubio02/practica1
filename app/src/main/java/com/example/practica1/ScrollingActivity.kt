package com.example.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.content.btnBuy.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Lionel_Messi")))
        }

        binding.content.btnBuy2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Cristiano_Ronaldo")))
        }

        binding.content.btnBuy3.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Diego_Maradona")))
        }

        binding.content.btnBuy4.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Jos%C3%A9_Luis_Gay%C3%A0")))
        }

        loadImageMessi()
        loadImageCris()
        loadImageMaradona()
        loadImageGaya()
    }

    private fun loadImageMessi(url: String = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Lionel_Messi_20180626.jpg/245px-Lionel_Messi_20180626.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard)
    }

    private fun loadImageCris(url: String = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Cristiano_Ronaldo_2018.jpg/245px-Cristiano_Ronaldo_2018.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard2)
    }

    private fun loadImageMaradona(url: String = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Maradona-Mundial_86_con_la_copa.JPG/272px-Maradona-Mundial_86_con_la_copa.JPG") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard3)
    }

    private fun loadImageGaya(url: String = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Jose_Gaya_2015_%28cropped%29.jpg/245px-Jose_Gaya_2015_%28cropped%29.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard4)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}