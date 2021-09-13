package com.example.peridoictable

data class PeriodTableModel(
    val name: String,
    // Atomic Weight
    val atomic_mass: Double,
    val spectral_img: String?,
    val summary: String,
    val symbol : String,
    val xpos: Byte,
    val ypos: Byte,
    val electron_configuration_semantic: String,

)