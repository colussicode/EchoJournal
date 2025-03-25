package com.example.echojournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.echojournal.ui.entryList.EntryListScreen
import com.example.echojournal.ui.splashScreen.SplashScreen
import com.example.echojournal.ui.theme.EchoJournalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EchoJournalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { pad ->
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navControllerHost = rememberNavController()
    NavHost(navController = navControllerHost, startDestination = R.id.splash_screen_route_id.toString()) {
        composable(R.id.splash_screen_route_id.toString()) {
            SplashScreen(modifier = Modifier.fillMaxSize(), navControllerHost)
        }

        composable(R.id.entry_list_route_id.toString()) {
            EntryListScreen()
        }
    }
}
