package com.example.composetest.example3

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.composetest.R

class CodeUI : AppCompatActivity() {
    private val myClickListener = View.OnClickListener { println("Button Clicked") }

    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = LinearLayout(this).apply {
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

            myButton = Button(this@CodeUI).apply {
                text = getString(R.string.click_me)
                layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                setOnClickListener(myClickListener)
            }.also(this::addView)
        }
        setContentView(view)
    }
}
