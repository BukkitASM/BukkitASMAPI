package com.bukkitasm.plugin.manager;

import com.bukkitasm.plugin.ILoadingPlugin;

import java.io.File;
import java.util.List;

/**
 * Created by Jasper on 4-10-2017.
 */
public class PluginManager {

    private List<ILoadingPlugin> plugins;
    private File pluginsDir;

    public PluginManager(File pluginsDir) {
        this.pluginsDir = pluginsDir;
    }

    public void initPluginManager()  {

    }


}
