package com.kenton.abstractfactory.product.concretematerial;

import com.kenton.abstractfactory.product.material.ITopping;

/**
 * @author KentonLee
 * @date 2019/3/1
 */
public class WuHanTopping extends ITopping {
    public WuHanTopping(String name){
        this.toppingName=name;
    }
}
