package com.bukkitasm.plugin;

import com.bukkitasm.transformer.ITransformer;

import java.util.ArrayList;

/**
 * Created by Jasper on 4-10-2017.
 */
public class ILoadingData {
    private String name;
    private String version;
    private ArrayList<ITransformer> transformers;

    public ILoadingData(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public ArrayList<ITransformer> getTransformers() {
        return transformers;
    }
}
