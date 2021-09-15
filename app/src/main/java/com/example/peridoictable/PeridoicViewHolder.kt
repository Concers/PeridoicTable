package com.example.peridoictable

import android.content.Context
import android.content.res.ColorStateList
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class PeridoicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(model: PeriodTableModel) {
        val id = itemView.findViewById<TextView>(R.id.id)
        id.text = model.id.toString()


        val name = itemView.findViewById<TextView>(R.id.name)
        name.text = model.name

        val symbol = itemView.findViewById<TextView>(R.id.symbol)
        symbol.text = model.symbol.toString()



        val color = itemView.findViewById<CardView>(R.id.gridlayout_cardview)
        color.setCardBackgroundColor(ContextCompat.getColor(itemView.context, R.color.he_color))



        fun Context.colorList(id: Int): ColorStateList {
            return ColorStateList.valueOf(ContextCompat.getColor(this, id))
        }
//
//        val atomic_mass = itemView.findViewById<TextView>(R.id.atomic_mass)
//        atomic_mass.text = model.atomic_mass.toString()
//
//        val spectral_img = itemView.findViewById<TextView>(R.id.spectral_img)
//
//
//
//        val summary = itemView.findViewById<TextView>(R.id.summary)


    }
}