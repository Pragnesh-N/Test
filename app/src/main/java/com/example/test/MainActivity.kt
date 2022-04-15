package com.example.test


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.findNavController


class MainActivity : AppCompatActivity() {
    lateinit var toolbar:androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as Fragment
//        val navController = navHostFragment.findNavController()
//        val drawerlayout:DrawerLayout = findViewById(R.id.drawer)
//        toolbar =findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        navController.addOnDestinationChangedListener(object : NavController.OnDestinationChangedListener{
//            override fun onDestinationChanged(
//                controller: NavController,
//                destination: NavDestination,
//                arguments: Bundle?
//            ) {
//                Log.e("nav","1."+destination.label+" 2. :"+controller.currentDestination)
//            }
//        })
    }


}