package ruiseki.okbase;

import ruiseki.okcore.config.ConfigLocation;
import ruiseki.okcore.config.ConfigurableProperty;
import ruiseki.okcore.config.extendedconfig.DummyConfig;
import ruiseki.okcore.tracking.Versions;

/**
 * A config with general options for this mod.
 *
 * @author rubensworks
 *
 */
public class GeneralConfig extends DummyConfig {

    @ConfigurableProperty(
        category = "core",
        comment = "If the version checker should be enabled.",
        configLocation = ConfigLocation.COMMON)
    public static boolean versionChecker = true;

    public GeneralConfig() {
        super(OKBase._instance, true, "general", null);
    }

    @Override
    public void onRegistered() {
        if (versionChecker) {
            Versions.registerMod(getMod(), OKBase._instance, Reference.VERSION_URL);
        }
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
