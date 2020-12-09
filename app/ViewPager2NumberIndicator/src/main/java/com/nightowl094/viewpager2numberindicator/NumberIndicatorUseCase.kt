package com.nightowl094.viewpager2numberindicator

import androidx.annotation.ColorRes
import androidx.viewpager2.widget.ViewPager2

interface NumberIndicatorUseCase {
    fun setContainerBackGround(@ColorRes color: Int)
    fun setIndicatorTextColor(@ColorRes color: Int)
    fun setViewPager2(vp2: ViewPager2)
}