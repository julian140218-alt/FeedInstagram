package me.juliangarcia.feedinstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.juliangarcia.feedinstagram.ui.screens.FeedScreen
import me.juliangarcia.feedinstagram.ui.theme.FeedInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FeedInstagramTheme {
                FeedScreen()
            }
        }
    }
}