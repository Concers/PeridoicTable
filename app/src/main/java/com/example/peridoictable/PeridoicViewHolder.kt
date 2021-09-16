package com.example.peridoictable

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.peridoictable.databinding.RowItemElementBinding


// val bingind = XMl inhret at
// view holder kısmına binding root ver.

class PeridoicViewHolder(
    private val bind: RowItemElementBinding
) : RecyclerView.ViewHolder(bind.root) {


    fun bind(model: PeriodTableModel) {
        bind.element?.name = "sadasdasda"
        bind.element?.symbol = "sadasdadsa"




//        val atomic_mass = itemView.findViewById<TextView>(R.id.atomic_mass)
//        atomic_mass.text = model.atomic_mass.toString()


    }
}