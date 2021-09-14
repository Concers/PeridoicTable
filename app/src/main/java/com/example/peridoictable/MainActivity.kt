package com.example.peridoictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val periodList = ArrayList<PeriodTableModel>()


        val hydrogen = PeriodTableModel(
            id = 1,
            name = "Hydrogen",
            atomic_mass = 1.008,
            symbol = "H",
            xpos = 1,
            ypos = 1,
            electron_configuration = "1s1"
        )

        val helium = PeriodTableModel(
            id = 2,
            name = "Helium",
            atomic_mass = 4.0026022,
            symbol = "He",
            xpos = 18,
            ypos = 1,
            electron_configuration = "1s2"
        )

        val lithium = PeriodTableModel(
            id = 3,
            name = "Lithium",
            atomic_mass = 6.94,
            symbol = "Li",
            xpos = 1,
            ypos = 2,
            electron_configuration = "1s2 2s1"
        )

        val beryllium = PeriodTableModel(
            id = 4,
            name = "Beryllium",
            atomic_mass = 9.01218315,
            symbol = "Be",
            xpos = 2,
            ypos = 2,
            electron_configuration = "1s2 2s2"
        )

        val boron = PeriodTableModel(
            id = 5,
            name = "Boron",
            atomic_mass = 10.81,
            symbol = "B",
            xpos = 13,
            ypos = 2,
            electron_configuration = "1s2 2s2"
        )

        val carbon = PeriodTableModel(
            id = 6,
            name = "Carbon",
            atomic_mass = 12.011,
            symbol = "C",
            xpos = 14,
            ypos = 2,
            electron_configuration = "1s2 2s2"
        )


        val nitrogen = PeriodTableModel(
            id = 7,
            name = "Nitrogen",
            atomic_mass = 14.007,
            symbol = "N",
            xpos = 15,
            ypos = 2,
            electron_configuration = "1s2 2s2"
        )

        val oxygen = PeriodTableModel(
            id = 7,
            name = "Oxygen",
            atomic_mass = 15.999,
            symbol = "O",
            xpos = 16,
            ypos = 2,
            electron_configuration = "1s2 2s2 2p4"
        )

        val fluorine = PeriodTableModel(
            id = 8,
            name = "Fluorine",
            atomic_mass = 18.9984031636,
            symbol = "F",
            xpos = 17,
            ypos = 2,
            electron_configuration = "1s2 2s2 2p5"
        )



        periodList.add(hydrogen)
        periodList.add(helium)
        periodList.add(lithium)
        periodList.add(beryllium)
        periodList.add(boron)
        periodList.add(carbon)
        periodList.add(nitrogen)

        val peridoicAdapter = PeridoicAdapter(periodList)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.adapter = peridoicAdapter

        recyclerView.layoutManager =
            GridLayoutManager(
                applicationContext,
                1,
                LinearLayoutManager.HORIZONTAL,
                false)

//        recyclerView.scaleX = 3F
//      recyclerView.scaleY = 18F



        recyclerView.addItemDecoration(EqualSpacingItemDecoration(10, 2))

    }


}