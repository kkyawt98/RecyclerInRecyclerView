package com.kyawt.recyclerinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.adapter.RecyclerAdapter
import com.kyawt.recyclerinrecyclerview.model.DATA

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        val dataList = ArrayList<DATA>()
        dataList.add(DATA(RecyclerAdapter.VIEW_TYPE_ONE, "1 . This is View 1"))
        dataList.add(DATA(RecyclerAdapter.VIEW_TYPE_TWO, "2 . This is View 2"))

        val adapter = RecyclerAdapter(this,dataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}