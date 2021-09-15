package com.example.peridoictable

data class PeriodTableModel(
    val id: String,
    val name: String = "",
    val color : String ="",
    // Atomic Weight
    val atomic_mass: String,
    val symbol: String,
    val isBlank: Boolean = false

)