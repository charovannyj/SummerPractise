package com.itis.summerpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val controller =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
                .navController

        findViewById<BottomNavigationView>(R.id.bottomNav).apply {
            setupWithNavController(controller)
        }
    }
}

enum class Month(var order: Int) {
    Jan(0), Feb(6), Apr(2), May(-1)
}