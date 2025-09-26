package com.example.firstapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                for(i in 0 until buttonStates.size) {
                    Button(onClick = {
                        if (buttonStates[i] == "off")
                            buttonStates[i] = "on"
                        else
                            buttonStates[i] = "off"
                    }) {
                        Text(buttonStates[i])
                    }
                }
                Button(onClick = {
                    for(i in 0 until buttonStates.size) {
                        buttonStates[i] = "off"
                    }
                }) { Text("Reset") }
            }
            Row {
                TextCard("check the logcat window")
                TextCard("dont check the logcat window")
                TextCard("i like to move it move it")
                TextCard("will anyone ever read this")
            }
        }
    }
    private var buttonStates = mutableStateListOf("off", "off", "off")
}

@Composable
fun TextCard(toDisplay: String) {
    Text(toDisplay)
}

