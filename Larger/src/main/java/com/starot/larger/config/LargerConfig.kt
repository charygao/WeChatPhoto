package com.starot.larger.config

import com.starot.larger.impl.OnImageLoad
import com.starot.larger.impl.OnLoadProgressListener


data class LargerConfig(
    //持续时间
    var duration: Long = 300,

    //是否自动加载大图
    var automaticLoadFullImage: Boolean = true,

    //图片加载器
    var imageLoad: OnImageLoad? = null,

    //加载的进度
    var imageProgress: OnLoadProgressListener? = null

)