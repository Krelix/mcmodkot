package com.otwtag.main

import com.otwtag.main.client.McModKotTab
import com.otwtag.main.items.ModItems
import com.otwtag.main.block.ModBlocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import com.otwtag.main.proxy.CommonProxy
import com.otwtag.main.recipe.ModRecipe
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

object MCModKotDefinition {
    const val MOD_ID = "mcmodkot"
    const val MOD_NAME = "Kotlin Tutorial Mod"
    const val MOD_VERSION = "1.0-SNAPSHOT"
}
/**
 * Created by Adrien on 17/11/2016.
 */
@Mod( modid=MCModKotDefinition.MOD_ID, name=MCModKotDefinition.MOD_NAME, version=MCModKotDefinition.MOD_VERSION)
open class MCModKot {

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        // Add a new event to the list of existing events
        ModRecipe.init()
    }

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        ModItems.init()
        ModBlocks.init()
    }

    companion object {
        @JvmStatic
        @SidedProxy(
                serverSide = "com.otwtag.main.proxy.CommonProxy",
                clientSide = "com.otwtag.main.proxy.ClientProxy"
        )
        lateinit var proxy: CommonProxy

        val creativeTab = McModKotTab()
    }
}