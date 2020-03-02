package com.example.composetest.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.composetest.R
import com.example.composetest.databinding.ActivityDatabindingUiBinding

class DatabindingUI : AppCompatActivity() {
    private val myClickListener = View.OnClickListener { println("Button Clicked") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDatabindingUiBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_databinding_ui)

        binding.buttonText = getString(R.string.click_me)
        binding.myClickListener = myClickListener
    }
}
