package com.example.peridoictable

import androidx.recyclerview.widget.GridLayoutManager


class SpanSizeLookup(
    var spanPos: Int,
    var spanCnt1: Int,
    var spanCnt2: Int
) :

    GridLayoutManager.SpanSizeLookup() {

    override fun getSpanSize(position: Int): Int {
        return if (position % spanPos == 0) spanCnt2 else spanCnt1
    }

}