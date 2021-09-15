package com.example.peridoictable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PeridoicAdapter(private val peridoicList: List<PeriodTableModel>) :
    RecyclerView.Adapter<PeridoicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeridoicViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.gridlayout, parent, false)
        return PeridoicViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PeridoicViewHolder, position: Int) {
        val newList = peridoicList[position]
        holder.bind(newList)
    }

    override fun getItemCount(): Int {
        return peridoicList.size
    }


}