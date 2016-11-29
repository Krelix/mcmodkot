package com.otwtag.main.recipe

import com.otwtag.main.block.ModBlocks
import com.otwtag.main.items.ModItems
import net.minecraft.init.Blocks
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.oredict.ShapedOreRecipe

/**
 * Created by Adrien on 28/11/2016.
 */
object ModRecipe {
    fun init() {
        GameRegistry.addShapelessRecipe(ItemStack(ModItems.cornSeed), ModItems.corn)
        // Define the position of items on the crafting grid
        // the first 3 String params place keys on specific part of the grid
        // the next parameters indicate what key is associated with what item
        GameRegistry.addShapedRecipe(ItemStack(Items.RABBIT_STEW),
                " R ", "CPM", " B ", 'R', Items.COOKED_RABBIT, 'C', ModItems.corn, 'P', Items.BAKED_POTATO, 'M', Blocks.BROWN_MUSHROOM, 'B', Items.BOWL)

        // Last param is amount of XP gained
        GameRegistry.addSmelting(ModBlocks.oreCopper, ItemStack(ModItems.ingotCopper), .7f)
        GameRegistry.addRecipe(ShapedOreRecipe(Items.BUCKET, "I I", " I ", 'I', "ingotCopper"))
    }
}