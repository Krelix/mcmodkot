package com.otwtag.main.items

import com.otwtag.main.MCModKot
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/**
 * Created by Adrien on 17/11/2016.
 */
open class ItemBase(var name:String) : Item(), ItemModelProvider {
    init {
        this.unlocalizedName = name
        setRegistryName(name)
        creativeTab = MCModKot.creativeTab
    }

    override fun registerItemModel(item: Item?){
        MCModKot.proxy.registerItemRenderer(this, 0, name)
    }

    override fun setCreativeTab(tab: CreativeTabs?): Item {
        super.setCreativeTab(tab)
        return this
    }
}