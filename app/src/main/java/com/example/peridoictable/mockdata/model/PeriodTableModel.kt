package com.example.peridoictable.mockdata.model

import com.example.peridoictable.mockdata.ElementGroup

data class PeriodTableModel(
    var name: String,
    val atomicnumber: Int?,
    val category: ElementGroup,
    var symbol: String,
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