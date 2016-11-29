@file:JvmName("ModBlocks")
package com.otwtag.main.block

import com.otwtag.main.items.ItemModelProvider
import com.otwtag.main.items.ItemOreDict
import net.minecraft.block.Block
import net.minecraft.item.ItemBlock
import net.minecraftforge.fml.common.registry.GameRegistry

/**
 * Created by Adrien on 27/11/2016.
 */
object ModBlocks {

    var oreCopper: BlockOre = BlockOre("oreCopper", "oreCopper")
    var cropCorn: BlockCropCorn = BlockCropCorn()
    var pedestal: BlockPedestal = BlockPedestal()

    fun init() {
        oreCopper = register(oreCopper)
        cropCorn = register(cropCorn, null)
        pedestal = register(pedestal)
    }

    private fun <T : Block> register(block: T, itemBlock: ItemBlock?): T {
        GameRegistry.register(block)
        if (itemBlock != null) {
            GameRegistry.register(itemBlock)
        }
        if (block is ItemModelProvider) {
            block.registerItemModel(itemBlock)
        }
        if(block is ItemOreDict) {
            block.initOreDict()
        }

        return block
    }

    private fun <T : Block> register(block: T): T {
        val itemBlock = ItemBlock(block)
        itemBlock.registryName = block.registryName
        return register(block, itemBlock)
    }

}