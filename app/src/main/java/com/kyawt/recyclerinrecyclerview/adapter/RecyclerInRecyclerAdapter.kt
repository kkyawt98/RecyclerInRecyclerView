package com.kyawt.recyclerinrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.R
import com.kyawt.recyclerinrecyclerview.model.DATA

class RecyclerInRecyclerAdapter (context: Context, list: ArrayList<DATA>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val list : ArrayList<DATA> = list
    private val context:Context = context

    private inner class RecyclerInRecyclerViewHolder1(itemView:View) : RecyclerView.ViewHolder(itemView){
        val message : TextView = itemView.findViewById(R.id.txt_item11)

        fun bind(position:Int){
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.dataText
        }
    }

    private inner class RecyclerInRecyclerViewHolder2(itemView: View) :RecyclerView.ViewHolder(itemView){
        val message :TextView = itemView.findViewById(R.id.txt_item22)

        fun bind(position: Int){
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.dataText
        }
    }

    companion object{
        const val VIEW_TYPE_11 = 1
        const val VIEW_TYPE_22 = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_11 ){
            return RecyclerInRecyclerViewHolder1(
                LayoutInflater.from(context).inflate(R.layout.item_view_11,parent,false)
            )
        }
        return RecyclerInRecyclerViewHolder2(
            LayoutInflater.from(context).inflate(R.layout.item_view_22,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (list[position].viewType == VIEW_TYPE_11){
            (holder as RecyclerInRecyclerViewHolder1).bind(position)
        }else{
            (holder as RecyclerInRecyclerViewHolder2).bind(position)
        }
    }
}