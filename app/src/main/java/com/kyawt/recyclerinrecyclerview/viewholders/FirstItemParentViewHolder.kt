package com.kyawt.recyclerinrecyclerview.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.adapter.SubAdapter
import com.kyawt.recyclerinrecyclerview.model.SubItem
import kotlinx.android.synthetic.main.item_view_1.view.*

class FirstItemParentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(subItems: List<SubItem>){
        itemView.recycler_item1.adapter = SubAdapter(subItems)
    }
}