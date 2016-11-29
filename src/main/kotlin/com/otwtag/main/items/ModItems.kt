@file:JvmName("ModItems")
package com.otwtag.main.items

import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry

// Packages in Kotlin can contain function and variables
// They're turned into static parts of a Class in Java
// the @file declaration allows you to define the class name
// inside the Java Code

object ModItems {

    var ingotCopper: ItemOre = ItemOre("ingotCopper", "ingotCopper")
    var cornSeed: ItemCornSeed = ItemCornSeed()
    var corn: ItemOre = ItemOre("corn", "cropCorn")

    fun init() {
        ingotCopper = register(ingotCopper)
        cornSeed = register(ItemCornSeed())
        corn = register(corn)
    }

    private fun <T : Item> register(item: T): T {
        GameRegistry.register(item)

        if (item is ItemModelProvider) {
            item.registerItemModel(item)
        }
        if(item is ItemOreDict) {
            item.initOreDict()
        }
        return item
    }
}