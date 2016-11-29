package com.otwtag.main.client

import com.otwtag.main.MCModKotDefinition
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import com.otwtag.main.items.ModItems

/**
 * Created by Adrien on 28/11/2016.
 */
class McModKotTab() : CreativeTabs(MCModKotDefinition.MOD_ID){
    init {
        backgroundImageName = "item_search.png"
    }

    override fun getTabIconItem(): Item {
        return ModItems.ingotCopper
    }

    override fun hasSearchBar(): Boolean {
        return true
    }
}