package com.example.peridoictable.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.peridoictable.viewholder.PeridoicViewHolder
import com.example.peridoictable.mockdata.model.PeriodTableModel
import com.example.peridoictable.R
import com.example.peridoictable.databinding.AdapterItemListBinding

class PeridoicAdapter(

    private val peridoicList: List<PeriodTableModel>,

    ) :
    RecyclerView.Adapter<PeridoicViewHolder>() {


    private lateinit var binding: AdapterItemListBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeridoicViewHolder {

        /** DataBinding->
         */
        val inflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.adapter_item_list,
            parent,
            false

        )
        return PeridoicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PeridoicViewHolder, position: Int) {
        val newList = peridoicList[position]
        holder.bind(newList, position)
    }

    override fun getItemCount(): Int {
        return peridoicList.size
    }


}