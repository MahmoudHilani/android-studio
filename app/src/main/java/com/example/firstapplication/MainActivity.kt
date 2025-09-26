package com.example.firstapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextCard("check the logcat window")
        }

        Log.i("logcat test", "information message")
        Log.v("logcat test", "verbose message")
        Log.w("logcat test", "warning message")
        Log.e("logcat test", "error message")
        Log.d("logcat test", "debug message")
        Log.wtf("logcat test", "something went rly bad message")
    }
}

@Composable
fun TextCard(toDisplay: String) {
    Text(toDisplay)
}

