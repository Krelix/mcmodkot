package com.otwtag.main.block

import com.otwtag.main.items.ItemOreDict
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.oredict.OreDictionary

/**
 * Created by Adrien on 27/11/2016.
 */
class BlockOre(name: String, var oreName: String) : BlockBase(Material.ROCK, name), ItemOreDict {
    init {
        setHardness(3f)
        setResistance(5f)
    }

    override fun initOreDict() {
        OreDictionary.registerOre(oreName, this)
    }

    override fun setCreativeTab(tab: CreativeTabs?): Block {
        super.setCreativeTab(tab)
        return this
    }
}