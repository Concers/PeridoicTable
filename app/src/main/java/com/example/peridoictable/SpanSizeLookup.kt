package com.example.peridoictable

import androidx.recyclerview.widget.GridLayoutManager

class SpanSizeLookup(val spanPos: Int, val spanCnt1: Int, val spanCnt2: Int) :
    GridLayoutManager.SpanSizeLookup() {
    val elementTour = ElementGroup.values()
    override fun getSpanSize(position: Int): Int {
        return if (position == spanPos) spanCnt1 else spanCnt2
    }
}
