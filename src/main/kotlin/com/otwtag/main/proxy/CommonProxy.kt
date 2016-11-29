package com.otwtag.main.proxy

import net.minecraft.item.Item
import net.minecraftforge.fml.common.SidedProxy

/**
 * Created by Adrien on 17/11/2016.
 */
open class CommonProxy {

    open fun registerItemRenderer(i: Item, meta: Int, id: String) {
        // TODO: Implement server side registration ?
    }

}