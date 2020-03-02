package com.example.composetest.example4

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.Button
import com.example.composetest.R

class JetpackComposeUI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModel(this)
        setContent {
            JetpackUI(viewModel)
        }
    }
}

class ViewModel(context: Context) {
    val buttonText = context.getString(R.string.click_me)
    val myClickListener = { println("Button Clicked") }
}

@Composable
fun JetpackUI(viewModel: ViewModel) {
    Column {
        Button(text = viewModel.buttonText, onClick = viewModel.myClickListener)
    }
}
