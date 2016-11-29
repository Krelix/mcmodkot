package com.otwtag.main.block

import com.otwtag.main.MCModKot
import com.otwtag.main.items.ItemModelProvider
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/**
 * Created by Adrien on 25/11/2016.
 */
open class BlockBase(material: Material, var name: String) : Block(material), ItemModelProvider{
    init{
        this.unlocalizedName = name
        setRegistryName(name)
        setCreativeTab(MCModKot.creativeTab)
    }

    override fun registerItemModel(item: Item?) {
        if(item != null)
            MCModKot.proxy.registerItemRenderer(item, 0, name)
    }

    override fun setCreativeTab(tab: CreativeTabs?): Block {
        super.setCreativeTab(tab)
        return this
    }

}