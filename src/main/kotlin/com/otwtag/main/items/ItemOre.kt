package com.otwtag.main.items

import net.minecraftforge.oredict.OreDictionary

/**
 * Created by Adrien on 29/11/2016.
 */
class ItemOre(name: String, var oreName: String) : ItemBase(name), ItemOreDict {

    override fun initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }



}