package com.starot.larger.config

import androidx.recyclerview.widget.RecyclerView
import com.starot.larger.impl.OnCustomItemViewListener

data class ListLargerConfig(
    //列表
    var recyclerView: RecyclerView? = null
) : BaseLargerConfig()