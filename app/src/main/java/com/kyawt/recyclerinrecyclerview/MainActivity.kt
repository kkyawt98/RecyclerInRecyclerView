package com.kyawt.recyclerinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.recyclerinrecyclerview.adapter.RecyclerAdapter
import com.kyawt.recyclerinrecyclerview.model.Data
import com.kyawt.recyclerinrecyclerview.model.SubItem
import com.kyawt.recyclerinrecyclerview.viewholders.ViewTypes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }


    private fun setUpRecyclerView(){
        recycler_view.adapter = RecyclerAdapter(staticData())
    }

    private fun staticData() = listOf<Data>(
        Data(ViewTypes.FIRST_VIEW_TYPE,firstItemList()),
        Data(ViewTypes.SECOND_VIEW_TYPE,secondItemList())
    )

    private fun firstItemList() = listOf<SubItem>(
        SubItem(1,"#3F3047"),
        SubItem(2,"#3F3047"),
        SubItem(3,"#3F3047"),
        SubItem(4,"#9BC995"),
        SubItem(1,"#3F3047"),
        SubItem(2,"#3F3047"),
        SubItem(3,"#3F3047"),
        SubItem(4,"#9BC995")
    )

    private fun secondItemList() = listOf<SubItem>(
        SubItem(1,"#5171A5"),
        SubItem(2,"#5171A5"),
        SubItem(3,"#5171A5"),
        SubItem(4,"#5171A5"),
        SubItem(1,"#5171A5"),
        SubItem(2,"#5171A5"),
        SubItem(3,"#5171A5"),
        SubItem(4,"#5171A5")
    )
}