package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    //lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*navHost=supportFragmentManager.findFragmentById(R.id.main_navegation) as NavHostFragment

    }*/
        supportFragmentManager.beginTransaction().add(R.id.main_fragmentos, FirstFragment()).commit()
        //supportFragmentManager.beginTransaction().add(R.id.apaisado_frag2, SecondFragment()).commit()
        if(findViewById<FrameLayout>(R.id.apaisado_frag2)!=null)
            supportFragmentManager.beginTransaction().add(R.id.apaisado_frag2, BlankFragment()).commit()
    }

    fun cambiarASecondFragment(){
        if(findViewById<FrameLayout>(R.id.apaisado_frag2)!=null)
            supportFragmentManager.beginTransaction().replace(R.id.apaisado_frag2, SecondFragment()).addToBackStack(null).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.main_fragmentos, SecondFragment()).addToBackStack(null).commit()
    }

    fun cambiarAFirstFragment(){
        if(findViewById<FrameLayout>(R.id.apaisado_frag2)!=null)
            supportFragmentManager.beginTransaction().replace(R.id.apaisado_frag2, BlankFragment()).addToBackStack(null).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.main_fragmentos, FirstFragment()).addToBackStack(null).commit()
    }

    /*override fun onSupportNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onSupportNavigateUp()
    }*/
}