package com.solawep.esperresource.region;

import com.solawep.esperresource.EsperResource;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RegionManager {
    private EsperResource plugin;

    public RegionManager(EsperResource _plugin) {
        this.plugin = _plugin;
    }

    public Region createRegion() {
        throw new NotImplementedException();
    }
}
