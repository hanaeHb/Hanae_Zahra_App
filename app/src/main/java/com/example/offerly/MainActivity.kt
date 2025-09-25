package com.example.offerly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.offerly.ui.theme.OfferlyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OfferlyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    androidx.compose.foundation.layout.Column(modifier = modifier) {
        Text(
            text = "Hello lalakom zahra w hanae $name!"
        )
        Text(
            text = "Hello zwinat & iwaaa ya lmoxahidiin $name!"
        )

    }
}

@Composable
fun AnotherGreeting(name: String) {
    Text(text = "Hi from AnotherGreeting $name!")
}

@Composable
fun Anotherzahra(name: String) {
    Text(text = "Hi from AnotherGreeting $name!")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OfferlyTheme {
        Greeting("Android")
    }
}