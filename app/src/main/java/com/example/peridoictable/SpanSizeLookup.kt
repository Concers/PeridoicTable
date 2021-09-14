package com.example.peridoictable

import androidx.recyclerview.widget.GridLayoutManager

class SpanSizeLookup(val spanPos: Int, val cont1: Int, val cont2: Int) :
    GridLayoutManager.SpanSizeLookup() {
    override fun getSpanSize(position: Int): Int {
        return if (position % spanPos == 0) {
            cont2
        } else {
            cont1
        }
    }
}