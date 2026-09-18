package ruiseki.okbase.proxy;

import ruiseki.okbase.OKBase;
import ruiseki.okcore.init.ModBase;
import ruiseki.okcore.proxy.CommonProxyComponent;

public class CommonProxy extends CommonProxyComponent {

    @Override
    public ModBase getMod() {
        return OKBase._instance;
    }
}
