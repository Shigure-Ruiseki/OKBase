package ruiseki.okbase;

import net.minecraft.client.gui.GuiScreen;

import ruiseki.okcore.client.gui.config.ExtendedConfigGuiFactoryBase;
import ruiseki.okcore.client.gui.config.GuiConfigOverviewBase;
import ruiseki.okcore.init.ModBase;

/**
 * @author rubensworks
 */
public class GuiConfigOverview extends GuiConfigOverviewBase {

    /**
     * Make a new instance.
     *
     * @param parentScreen the parent GuiScreen object
     */
    public GuiConfigOverview(GuiScreen parentScreen) {
        super(OKBase._instance, parentScreen);
    }

    @Override
    public ModBase getMod() {
        return OKBase._instance;
    }

    public static class ExtendedConfigGuiFactory extends ExtendedConfigGuiFactoryBase {

        @Override
        public Class<? extends GuiConfigOverviewBase> mainConfigGuiClass() {
            return GuiConfigOverview.class;
        }
    }
}
