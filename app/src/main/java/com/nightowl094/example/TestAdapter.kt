package com.nightowl094.example

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_test_adapter.*

class TestAdapter(private val dataList: List<Int>) : RecyclerView.Adapter<TestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder =
        TestViewHolder(parent, R.layout.item_test_adapter)

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.apply {
            tv_ita123.text = dataList[position].toString()
        }
    }

}