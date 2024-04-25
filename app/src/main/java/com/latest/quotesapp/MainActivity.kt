package com.latest.quotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.latest.quotesapp.navigation.NavGraphBuilder
import com.latest.quotesapp.screens.QuoteListScreen
import com.latest.quotesapp.ui.theme.QuotesAppTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.launch(Dispatchers.IO) {
            DataManager.loadAssetsFromFile(applicationContext)
        }

        setContent {
            QuotesAppTheme {
                val navController = rememberNavController()
                NavGraphBuilder(navController = navController)
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier, navController : NavHostController) {

}
