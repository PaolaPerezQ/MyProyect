package com.example.myproyect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myproyect.databinding.ActivityMain2Binding
import com.example.myproyect.ui.BlankFragmentOne

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main2)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val ButtonOpen : Button = findViewById(R.id.button_abrir)
        ButtonOpen.setOnClickListener{
            val myFragment = BlankFragmentOne()
            val fragment : Fragment? =
                supportFragmentManager.findFragmentByTag(BlankFragmentOne::class.java.simpleName)
            if (fragment !is BlankFragmentOne){
                supportFragmentManager.beginTransaction()
                    .add(R.id.nav_host_fragment_activity_main2,myFragment,BlankFragmentOne::class.java.simpleName)
                    .commit()
            }
        }


    }
}