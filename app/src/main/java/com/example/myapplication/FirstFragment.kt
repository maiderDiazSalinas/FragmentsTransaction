package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).getSupportActionBar()?.setDisplayHomeAsUpEnabled(false)

        view.findViewById<Button>(R.id.first_bSiguiente).setOnClickListener{
            (activity as MainActivity).cambiarASecondFragment()
            //(activity as MainActivity).navHost.navController.navigate(R.id.action_firstFragment_to_secondFragment)
            //(activity as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.apaisado_frag2, SecondFragment()).addToBackStack(null).commit()
        }
    }
}