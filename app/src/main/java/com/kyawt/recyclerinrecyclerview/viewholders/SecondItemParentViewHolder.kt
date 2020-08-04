package com.kyawt.recyclerinrecyclerview.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.adapter.SubAdapter
import com.kyawt.recyclerinrecyclerview.model.SubItem
import kotlinx.android.synthetic.main.item_view2.view.*

class SecondItemParentViewHolder(
    private val item: View
): RecyclerView.ViewHolder(item) {
    fun bind(subItem: List<SubItem>){
        item.recycler_item2.adapter = SubAdapter(subItem)
    }
}