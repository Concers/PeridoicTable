package com.example.peridoictable

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeridoicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(model: PeriodTableModel) {
        val id = itemView.findViewById<TextView>(R.id.id)
        id.text = model.id.toString()


        val name = itemView.findViewById<TextView>(R.id.name)
        name.text = model.name


        val atomic_mass = itemView.findViewById<TextView>(R.id.atomic_mass)
        atomic_mass.text = model.atomic_mass.toString()

        val spectral_img = itemView.findViewById<TextView>(R.id.spectral_img)



        val summary = itemView.findViewById<TextView>(R.id.summary)



    }
}