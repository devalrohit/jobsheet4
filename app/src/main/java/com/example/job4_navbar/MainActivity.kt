package com.example.job4_navbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var  navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val navHostFragment =
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment

    val navController = navHostFragment.navController
    findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        .setupWithNavController(navController)


    val appBarConfiguration = AppBarConfiguration(
        setOf(
            R.id.recipesFragmen,
            R.id.favoriteRecipesFragment,
            R.id.userProfileFragmen,
        )
    )

}
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    }
