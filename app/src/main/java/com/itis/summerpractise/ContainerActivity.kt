package com.itis.summerpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
        findViewById<BottomNavigationView>(R.id.bottomNav).apply{
            setupWithNavController((supportFragmentManager.findFragmentById(R.id.container) as? NavHostFragment)?.navController!!)
        /*
            setOnItemSelectedListener {
                when(it.itemId){
                    R.id.itemi -> navigateUpTo()
                    }
                }
            }*/
        }
    }

}