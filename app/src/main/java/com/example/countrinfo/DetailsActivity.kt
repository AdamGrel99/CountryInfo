package com.example.countrinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        if(intent != null){
            val countryName = intent.getStringExtra("country_name") ?: "Niemcy"
            val countryId = resources.getIdentifier(countryName.lowercase(),
                "drawable",packageName)
            val textFileID = resources.getIdentifier(countryName.lowercase(),
                "raw",packageName)
            val fileText = resources.openRawResource(textFileID).bufferedReader()
                .readText()
            country_name.text = countryName
            country_image.setImageResource(countryId)
            country_details.text = fileText
        }
    }
}