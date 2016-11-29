package com.otwtag.main.items

import net.minecraft.item.Item

/**
 * Created by Adrien on 27/11/2016.
 */
interface ItemModelProvider {
    fun registerItemModel(item: Item?)
}