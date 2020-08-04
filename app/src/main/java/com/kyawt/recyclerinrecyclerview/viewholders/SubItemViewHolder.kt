package com.kyawt.recyclerinrecyclerview.viewholders

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.model.SubItem
import kotlinx.android.synthetic.main.sub_item.view.*

class SubItemViewHolder(
    private val iView: View
): RecyclerView.ViewHolder(iView) {
    fun bind(subItem: SubItem){
        iView.root.setBackgroundColor(Color.parseColor(subItem.colorRes))
    }
}