package com.kyawt.recyclerinrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.R
import com.kyawt.recyclerinrecyclerview.model.DATA
import kotlinx.android.synthetic.main.item_view_1.view.*

class RecyclerAdapter(context: Context, list: ArrayList<DATA>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val context:Context = context
    private val list : ArrayList<DATA> = list


    companion object{
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    private inner class RecyclerViewHolder1(itemView:View): RecyclerView.ViewHolder(itemView){
        val message: TextView = itemView.findViewById(R.id.txt_item1)

        fun bind(position: Int){
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.dataText
        }
    }

    private inner class RecyclerViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView){
        val message :TextView = itemView.findViewById(R.id.txt_item2)

        fun bind(position: Int){
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.dataText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_ONE){
            return RecyclerViewHolder1(
                LayoutInflater.from(context).inflate(R.layout.item_view_1,parent,false)
            )
        }

        return RecyclerViewHolder2(
            LayoutInflater.from(context).inflate(R.layout.item_view_2,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (list[position].viewType == VIEW_TYPE_ONE){
            (holder as RecyclerViewHolder1).bind(position)
        }else{
            (holder as RecyclerViewHolder2).bind(position)
        }
    }

    override fun getItemViewType(position: Int): Int{
        return list[position].viewType
    }
}