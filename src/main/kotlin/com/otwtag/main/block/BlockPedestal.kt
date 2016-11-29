package com.otwtag.main.block

import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState

/**
 * Created by Adrien on 29/11/2016.
 */
class BlockPedestal() : BlockBase(Material.ROCK, "pedestal") {
    override fun isOpaqueCube(p_isOpaqueCube_1_: IBlockState?): Boolean {
        return false
    }

    override fun isFullCube(p_isFullCube_1_: IBlockState?): Boolean {
        return false
    }
}