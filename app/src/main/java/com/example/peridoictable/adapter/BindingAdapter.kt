package com.example.peridoictable.adapter

import android.view.View
import androidx.databinding.BindingAdapter
import com.example.peridoictable.mockdata.model.PeriodTableModel


@BindingAdapter("isvisible")
fun isVisibility(v: View, model: PeriodTableModel) {

    if (model.visible) {
        v.visibility = View.INVISIBLE
    } else {
        v.visibility = View.VISIBLE
    }
}



