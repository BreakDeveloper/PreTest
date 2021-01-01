package com.example.pretest.data.entity

import androidx.annotation.IntDef
import com.example.pretest.base.BaseEntity

class ItemEntity(
    @ItemType type: Int,
    var bean: Any
) : BaseEntity() {
    init {
        mItemType = type
    }

    companion object {
        const val ITEM_DETAIL = 0
        const val ITEM_HOME = 1
    }

    @IntDef(
        ITEM_HOME,
        ITEM_DETAIL
    )
    @Retention(AnnotationRetention.SOURCE)
    annotation class ItemType
}