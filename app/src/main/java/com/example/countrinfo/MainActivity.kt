package com.example.countrinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countryonClick(view: View){
        val button = view as ImageButton
        val tag = button.tag.toString()

        val myIntent = Intent(this,
            DetailsActivity::class.java)
        myIntent.putExtra("country_name", tag)
        startActivity(myIntent)
    }
}