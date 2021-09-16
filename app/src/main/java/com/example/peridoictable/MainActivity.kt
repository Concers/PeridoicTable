package com.example.peridoictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.peridoictable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val peridoicAdapter = PeridoicAdapter(Data.getData())
        binding.recyclerview.layoutManager = GridLayoutManager(
            applicationContext,
            9,
            GridLayoutManager.HORIZONTAL,
            false
        )
        binding.recyclerview.adapter = peridoicAdapter


    }


}

