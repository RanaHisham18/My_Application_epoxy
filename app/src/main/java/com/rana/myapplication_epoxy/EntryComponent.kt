package com.rana.myapplication_epoxy

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.rana.myapplication_epoxy.databinding.EntryItemBinding

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class EntryComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(
    context, attrs, defStyleAttr
) {

private val binding: EntryItemBinding =
    EntryItemBinding.inflate(LayoutInflater.from(context), this)

    @ModelProp
    fun setEntry(entry: Entry){
        binding.entryNameItem.text = entry.name
    }
}