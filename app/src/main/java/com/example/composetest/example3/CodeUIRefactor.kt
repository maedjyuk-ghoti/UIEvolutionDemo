package com.example.composetest.example3

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.composetest.R

class CodeUIRefactor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModel(this)
        val view = View(viewModel).createView(this)
        setContentView(view)
    }
}

class ViewModel(context: Context) {
    val buttonText = context.getString(R.string.click_me)
    val myClickListener = View.OnClickListener { println("Button Clicked") }
}

class View(private val viewModel: ViewModel) {
    fun createView(context: Context): View =
        with(context) {
            LinearLayout(this).apply {
                layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

                Button(this@with).apply {
                    text = viewModel.buttonText
                    layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                    setOnClickListener(viewModel.myClickListener)
                }.also(this::addView)
            }
        }
}
