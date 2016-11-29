package com.otwtag.main.items

import com.otwtag.main.block.ModBlocks
import com.otwtag.main.MCModKot
import net.minecraft.init.Blocks
import net.minecraft.item.Item
import net.minecraft.item.ItemSeeds

/**
 * Created by Adrien on 28/11/2016.
 */
class ItemCornSeed() : ItemSeeds(ModBlocks.cropCorn, Blocks.FARMLAND), ItemModelProvider {
    val ITEM_NAME: String = "cornSeed"
    init {
        unlocalizedName = ITEM_NAME
        setRegistryName(ITEM_NAME)
        creativeTab = MCModKot.creativeTab
    }

    override fun registerItemModel(item: Item?) {
        if(item != null)
            MCModKot.proxy.registerItemRenderer(item, 0, ITEM_NAME)
    }
}