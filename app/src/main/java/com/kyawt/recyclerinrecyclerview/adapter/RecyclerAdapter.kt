package com.kyawt.recyclerinrecyclerview.adapter

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.R
import com.kyawt.recyclerinrecyclerview.exts.bindedView
import com.kyawt.recyclerinrecyclerview.model.Data
import com.kyawt.recyclerinrecyclerview.viewholders.FirstItemParentViewHolder
import com.kyawt.recyclerinrecyclerview.viewholders.SecondItemParentViewHolder
import com.kyawt.recyclerinrecyclerview.viewholders.ViewTypes

class RecyclerAdapter(
    private val list: List<Data>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            ViewTypes.FIRST_VIEW_TYPE -> return FirstItemParentViewHolder(parent.context.bindedView(R.layout.item_view_1,parent))
            ViewTypes.SECOND_VIEW_TYPE -> return  SecondItemParentViewHolder(parent.context.bindedView(R.layout.item_view2,parent))

        }
        return SecondItemParentViewHolder(parent.context.bindedView(R.layout.item_view2,parent))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int){
        Log.d("Main__","${list[position].viewType}")
        when(list[position].viewType){
            ViewTypes.FIRST_VIEW_TYPE -> (holder as FirstItemParentViewHolder).bind(list[position].data)
            ViewTypes.SECOND_VIEW_TYPE -> (holder as SecondItemParentViewHolder).bind(list[position].data)
        }
    }

    override fun getItemViewType(position: Int): Int{
        return list[position].viewType
    }
}