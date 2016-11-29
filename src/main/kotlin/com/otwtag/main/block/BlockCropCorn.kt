package com.otwtag.main.block

import com.otwtag.main.MCModKot
import com.otwtag.main.items.ModItems
import net.minecraft.block.BlockCrops
import net.minecraft.item.Item

/**
 * Created by Adrien on 27/11/2016.
 */
class BlockCropCorn() : BlockCrops() {
    val ITEM_NAME : String = "cropCorn"
    init {
        unlocalizedName = ITEM_NAME
        setRegistryName(ITEM_NAME)
        setCreativeTab(MCModKot.creativeTab)
    }

    override fun getSeed(): Item {
        return ModItems.cornSeed
    }

    override fun getCrop(): Item {
        return ModItems.corn
    }
}