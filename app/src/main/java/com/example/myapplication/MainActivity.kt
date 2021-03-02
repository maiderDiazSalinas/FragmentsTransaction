package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.main_fragmentos, FirstFragment()).commit()
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
            supportFragmentManager.beginTransaction().replace(R.id.apaisado_frag2, BlankFragment()).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.main_fragmentos, FirstFragment()).addToBackStack(null).commit()
    }
}