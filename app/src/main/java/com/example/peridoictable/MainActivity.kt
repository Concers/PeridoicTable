package com.example.peridoictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.peridoictable.adapter.PeridoicAdapter
import com.example.peridoictable.databinding.ActivityMainBinding
import com.example.peridoictable.mockdata.Data

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        val elementAll = Data.getData()
        val peridoicAdapter = PeridoicAdapter(elementAll)

        binding.recyclerview.layoutManager = GridLayoutManager(
            this, 9, GridLayoutManager.HORIZONTAL, false
        )
        binding.recyclerview.setHasFixedSize(true)

        binding.recyclerview.adapter = peridoicAdapter

    }




}