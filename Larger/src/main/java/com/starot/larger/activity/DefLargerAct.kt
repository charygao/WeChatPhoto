package com.starot.larger.activity

import android.util.Log
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.starot.larger.R
import com.starot.larger.view.image.OnViewDragListener
import com.starot.larger.view.image.PhotoView
import kotlin.math.abs

class DefLargerAct : LargerAct<String>() {


    override fun getData(): List<String>? {
        return intent.getStringArrayListExtra(IMAGE)
    }


    //设置 持续时间
    override fun setDuration(): Long {
        return 200
    }

    //设置阻尼系数
    override fun setDamping(): Float {
        return 1.0f
    }

    override fun item(itemView: View, photoView: PhotoView, position: Int, data: String?) {
        Glide.with(this).load(data).into(photoView)
    }

    //长按事件
    override fun onLongClickListener() {
        Toast.makeText(this, "长按图片", Toast.LENGTH_LONG).show()
    }

}