package com.example.pretest.base

import com.chad.library.adapter.base.entity.MultiItemEntity

abstract class BaseEntity : MultiItemEntity {

    protected var mItemType: Int = 1

    override val itemType = mItemType
}