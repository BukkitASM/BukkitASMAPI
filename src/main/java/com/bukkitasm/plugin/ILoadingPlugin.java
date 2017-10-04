package com.bukkitasm.plugin;

/**
 * Created by Jasper on 4-10-2017.
 */
public abstract class ILoadingPlugin {

    private ILoadingData iLoadingData;

    //Set the iLoadingData here
    public abstract void preSetup();

    public ILoadingData getiLoadingData() {
        return iLoadingData;
    }

    public void setILoadingData(ILoadingData iLoadingData) {
        this.iLoadingData = iLoadingData;
    }

}
