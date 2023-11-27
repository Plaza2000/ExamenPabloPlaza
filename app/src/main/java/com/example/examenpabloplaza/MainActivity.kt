package com.example.examenpabloplaza

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {


private lateinit var  NumeroText: Number
    val sendIntent: Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
        type = "text/plain"
    }

    val callIntent: Intent = Uri.parse("tel:5551234").let { number ->
        Intent(Intent.ACTION_DIAL, number)
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}