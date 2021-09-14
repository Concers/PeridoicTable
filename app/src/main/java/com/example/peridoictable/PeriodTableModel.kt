package com.example.peridoictable

data class PeriodTableModel(
    val id: Byte,
    val name: String,
    // Atomic Weight
    val atomic_mass: Double,
    val symbol: String,
    val xpos: Byte,
    val ypos: Byte,
    val electron_configuration: String,
    val isBlank: Boolean = false

)