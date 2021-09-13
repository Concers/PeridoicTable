package com.example.peridoictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    val periodList: ArrayList<PeriodTableModel> = ArrayList<PeriodTableModel>()


    val hydrogen = PeriodTableModel(
        name = "Hydrogen",
        atomic_mass = 1.008,
        spectral_img = "https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg",
        summary = "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.",
        symbol = "H",
        xpos = 1,
        ypos = 1,
        electron_configuration_semantic = "1s1"
    )

    val helium = PeriodTableModel(
        name = "Helium",
        atomic_mass = 4.0026022,
        spectral_img = "https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg",
        summary = "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.",
        symbol = "He",
        xpos = 18,
        ypos = 1,
        electron_configuration_semantic = "1s2"
    )



}