package net.petrus.mccourse.item.custom;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.petrus.mccourse.util.ModTags;

public class PaxelItem extends MiningToolItem {
    public PaxelItem( ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINEABLE, settings);
    }
}
