package com.example.peridoictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val linearLayoutManagerVertical =
//            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val linearLayoutManagerHorizontal =
//            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //  val gridLayoutManagerVertical = GridLayoutManager(this, 2)

        //spancount dikey

        val gridLayoutManagerHorizontal =
            GridLayoutManager(this, 9, GridLayoutManager.HORIZONTAL, false)


        //set SpanSizeLookup()
        //  gridLayoutManagerVertical.spanSizeLookup = MySpanSizeLookup(18, 1, 2)
//        gridLayoutManagerHorizontal.spanSizeLookup = SpanSizeLookup(3, 4, 2)


        val peridoicAdapter = PeridoicAdapter(Data.getData())
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = peridoicAdapter
        recyclerView.layoutManager = gridLayoutManagerHorizontal


    }


}