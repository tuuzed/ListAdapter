package com.tuuzed.androidx.recyclerview.adapter.loadmore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.StaggeredGridLayoutManager


internal object Utils {

    fun setItemViewFullSpan(itemView: View) {
        //当为StaggeredGridLayoutManager的时候,设置footerView占据整整一行
        val layoutParams = itemView.layoutParams
        if (layoutParams is StaggeredGridLayoutManager.LayoutParams) {
            layoutParams.isFullSpan = true
        }
    }

    fun inflateView(parent: ViewGroup, @LayoutRes resource: Int): View {
        return LayoutInflater.from(parent.context).inflate(resource, parent, false)
    }

}