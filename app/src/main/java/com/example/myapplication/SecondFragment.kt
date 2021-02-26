package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //(activity as MainActivity).getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        view.findViewById<Button>(R.id.second_bVolver).setOnClickListener{
            (activity as MainActivity).cambiarAFirstFragment()
            //(activity as MainActivity).navHost.navController.navigate(R.id.action_secondFragment_to_firstFragment)
            //(activity as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_fragmentos, FirstFragment()).addToBackStack(null).commit()
        }
    }
}