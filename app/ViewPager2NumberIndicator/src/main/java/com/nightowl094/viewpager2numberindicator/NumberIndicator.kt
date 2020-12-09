package com.nightowl094.viewpager2numberindicator

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.layout_number_indicator.view.*

class NumberIndicator @JvmOverloads constructor(
    context: Context?, attrs: AttributeSet?, defStyleAttr: Int = 0
) : ConstraintLayout(context!!, attrs, defStyleAttr), NumberIndicatorUseCase {

    init {
        inflate(context, R.layout.layout_number_indicator, this)
    }

    override fun setContainerBackGround(color: Int) {
        mcv_lni2_container.setCardBackgroundColor(ResourcesCompat.getColor(resources, color, null))
    }

    override fun setIndicatorTextColor(color: Int) {
        ResourcesCompat.getColor(resources, color, null).let { textColor ->
            tv_lni2_currentPosition.setTextColor(textColor)
            tv_lni2_and.setTextColor(textColor)
            tv_lni2_itemCount.setTextColor(textColor)
        }
    }

    override fun setViewPager2(vp2: ViewPager2) {
        vp2.adapter?.itemCount?.let { itemCount ->
            setIndicatorMaxSize(itemCount)
        }

        setIndicatorPosition(vp2.currentItem + 1)

        vp2.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)

                    setIndicatorPosition(position + 1)
                }
            })
    }

    private fun setIndicatorPosition(position: Int) {
        tv_lni2_currentPosition.text = position.toString()
    }

    private fun setIndicatorMaxSize(size: Int) {
        tv_lni2_itemCount.text = size.toString()
    }

}