package ruiseki.okbase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ruiseki.okcore.helper.LangHelpers;

public class OKPCreativeTab extends CreativeTabs {

    public static final OKPCreativeTab INSTANCE = new OKPCreativeTab();

    public OKPCreativeTab() {
        super(Reference.MOD_ID);
    }

    @Override
    public Item getTabIconItem() {
        return Items.apple;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel() {
        return LangHelpers.localize("creativetab." + getTabLabel());
    }
}
