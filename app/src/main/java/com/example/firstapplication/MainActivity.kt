package com.example.firstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                TextCard("check the logcat window")
                TextCard("dont check the logcat window")
                TextCard("i like to move it move it")
                TextCard("will anyone ever read this")
                Button(onClick = {
                    if(buttonText.value == "off")
                        buttonText.value = "on"
                    else
                        buttonText.value = "off"
                }) {
                    Text(buttonText.value)
                }
            }
            Row {
                TextCard("check the logcat window")
                TextCard("dont check the logcat window")
                TextCard("i like to move it move it")
                TextCard("will anyone ever read this")
            }
        }
    }
    var buttonText = mutableStateOf("off")
}

@Composable
fun TextCard(toDisplay: String) {
    Text(toDisplay)
}

