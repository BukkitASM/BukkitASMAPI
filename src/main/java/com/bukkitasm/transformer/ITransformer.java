package com.bukkitasm.transformer;

/**
 * Created by Jasper on 4-10-2017.
 */
public class ITransformer {

    public String classTarget;

    public ITransformer(String classTarget) {
        this.classTarget = classTarget;
    }

    public byte[] transform(String className, byte[] buffer) {
        return buffer;
    }


}
