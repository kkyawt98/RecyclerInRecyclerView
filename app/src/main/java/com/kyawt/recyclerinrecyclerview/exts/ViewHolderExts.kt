package com.kyawt.recyclerinrecyclerview.exts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Don't repeat urself
 */
fun Context.bindedView(layoutRes: Int,container: ViewGroup): View{
    return LayoutInflater.from(this).inflate(layoutRes,container,false)
}