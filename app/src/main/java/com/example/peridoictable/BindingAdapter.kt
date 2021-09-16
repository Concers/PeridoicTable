package com.example.peridoictable

import android.content.Context
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter


@BindingAdapter("backgroundcolor")
fun setBackgroundColor(v: FrameLayout, type: Int) {

    when (type) {
        ElementGroup.UNKNOWN.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )
        ElementGroup.NONMETAL.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )

        ElementGroup.NOBLEGAS.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )

        ElementGroup.ALKALIMETAL.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )
        ElementGroup.ALKALINEEARTH_METAL.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )
        ElementGroup.METALLOID.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )
        ElementGroup.POST_TRANSITION_METAL.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )


        ElementGroup.TRANSITION_METAL.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )

        ElementGroup.LANTHANIDE.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )
        ElementGroup.ACTINIDE.ordinal -> v.setBackgroundColor(
            v.context,
            android.R.color.background_dark
        )

        else -> v.setBackgroundColor(v.context, R.color.cardview_dark_background)


    }


}


private fun FrameLayout.setBackgroundColor(v: Context, color: Int): Int {
    return ContextCompat.getColor(v, color)
}

