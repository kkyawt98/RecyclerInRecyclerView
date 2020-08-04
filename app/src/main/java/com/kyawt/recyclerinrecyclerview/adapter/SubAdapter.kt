package com.kyawt.recyclerinrecyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.R
import com.kyawt.recyclerinrecyclerview.exts.bindedView
import com.kyawt.recyclerinrecyclerview.model.SubItem
import com.kyawt.recyclerinrecyclerview.viewholders.SubItemViewHolder

class SubAdapter (
    private val list: List<SubItem>
): RecyclerView.Adapter<SubItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubItemViewHolder {
        return SubItemViewHolder(parent.context.bindedView(R.layout.sub_item,parent))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SubItemViewHolder, position: Int) {
        holder.bind(list[position])
    }
}