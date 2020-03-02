package com.example.composetest.example1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.composetest.R

class StandardUI : AppCompatActivity() {
    private val myClickListener = View.OnClickListener { println("Button Clicked") }

    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard_ui)

        myButton = findViewById(R.id.myButton)
        myButton.setOnClickListener(myClickListener)
    }
}
