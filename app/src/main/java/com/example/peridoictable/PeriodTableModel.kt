package com.example.peridoictable

data class PeriodTableModel(
    val name: String,
    val atomicnumber: Int?,
    // Atomic Weight
    val category: Int?,
    val symbol: String,
    val atomicweight: String,
    val atomicweightfull: String,
    val occurrence: String,
    val stateofmatter: String,
    val group: Int?,
    val period: Int?,
    val block: String,
    val tablerow18col: Int?,
    val tablecolumn18col: Int?,
    val visible: Boolean = true,


    )