package com.otwtag.main.proxy

import com.otwtag.main.MCModKot
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader

/**
 * Created by Adrien on 17/11/2016.
 */
open class ClientProxy : CommonProxy() {


    override fun registerItemRenderer(i: Item, meta: Int, id: String) {
        val modRes: ModelResourceLocation = ModelResourceLocation("mcmodkot:$id", "inventory")
        ModelLoader.setCustomModelResourceLocation(i, meta, modRes)
    }
}