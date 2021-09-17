package com.example.peridoictable.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.peridoictable.R
import com.example.peridoictable.databinding.AdapterItemListBinding
import com.example.peridoictable.mockdata.ElementGroup
import com.example.peridoictable.mockdata.model.PeriodTableModel

class PeridoicViewHolder(
    private val binding: AdapterItemListBinding
) :
    RecyclerView.ViewHolder(binding.root) {


    fun bind(model: PeriodTableModel, position: Int) {

        binding.name.text = model.name

        binding.cardview.background(model)
    }

    private fun View.background(element: PeriodTableModel) {
        this.setBackgroundResource(
            when (element.category) {
                ElementGroup.NONMETAL -> R.color.non_metal
                ElementGroup.NOBLEGAS -> R.color.noble_gas
                ElementGroup.ALKALIMETAL -> R.color.alkali_metal
                ElementGroup.ALKALINEEARTH_METAL -> R.color.alkalineearth_metal
                ElementGroup.METALLOID -> R.color.metaloid
                ElementGroup.POST_TRANSITION_METAL -> R.color.post_transition_metal
                ElementGroup.UNKNOWN -> R.color.unknown
                ElementGroup.TRANSITION_METAL -> R.color.transition_metal
                ElementGroup.LANTHANIDE -> R.color.lanthanide
                else -> R.color.he_color

            }
        )
    }
}