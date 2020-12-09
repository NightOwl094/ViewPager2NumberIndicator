package com.nightowl094.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2()
        initIndicator()
    }

    private fun initViewPager2() {
        vp2_am.apply {
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            adapter = TestAdapter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        }
    }

    private fun initIndicator() {
        ni_am.apply {
            setViewPager2(vp2_am)
        }
    }

}