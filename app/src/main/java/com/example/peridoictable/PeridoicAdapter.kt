package com.example.peridoictable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peridoictable.databinding.RowItemElementBinding

class PeridoicAdapter(data: List<PeriodTableModel>) : RecyclerView.Adapter<PeridoicViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    )
            : PeridoicViewHolder {
        val itembinding =
            RowItemElementBinding
                .inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )

        return PeridoicViewHolder(itembinding)


    }

    override fun onBindViewHolder(holder: PeridoicViewHolder, position: Int) {

        val newList = Data.getData()[position]
        holder.bind(newList)
    }

    override fun getItemCount(): Int {
        return Data.getData().size
    }


}