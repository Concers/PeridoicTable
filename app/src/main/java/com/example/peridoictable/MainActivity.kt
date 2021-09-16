package com.example.peridoictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val peridoicAdapter = PeridoicAdapter(Data.getData())

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = GridLayoutManager(
            applicationContext,
            9,
            GridLayoutManager.HORIZONTAL,
            false
        )


        recyclerView.adapter = peridoicAdapter


        recyclerView.setHasFixedSize(true)

    }


}

