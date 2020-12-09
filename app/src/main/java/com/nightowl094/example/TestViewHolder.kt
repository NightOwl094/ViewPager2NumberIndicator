package com.nightowl094.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class TestViewHolder(parent: ViewGroup, @LayoutRes layout_ID: Int) : RecyclerView.ViewHolder(
    LayoutInflater
        .from(parent.context)
        .inflate(layout_ID, parent, false)
), LayoutContainer {
    override val containerView: View
        get() = itemView
}