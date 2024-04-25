package com.latest.quotesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.latest.quotesapp.DataManager
import com.latest.quotesapp.screens.QuoteDetailScreen
import com.latest.quotesapp.screens.QuoteListItem
import com.latest.quotesapp.screens.QuoteListScreen

@Composable
fun NavGraphBuilder(navController : NavHostController) {

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {

        composable(Screen.HomeScreen.route){
            QuoteListScreen(data = DataManager.data, navController = navController)
        }

        composable(Screen.DetailScreen.route){
            QuoteDetailScreen()
        }

    }

}