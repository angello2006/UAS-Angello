package com.example.infokesehatan

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.infokesehatan.MyHealthApp
import com.example.infokesehatan.ProfileScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "homescreen"
    ) {
        composable("homescreen") {
            MyHealthApp(navController)
        }
        composable("profilescreen") {
            ProfileScreen(navController)
        }
    }
}