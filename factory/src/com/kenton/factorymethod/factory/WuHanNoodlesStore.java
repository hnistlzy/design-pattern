package com.kenton.factorymethod.factory;

import com.kenton.factorymethod.product.AbstractNoodles;
import com.kenton.factorymethod.product.WuHanNoodles;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public class WuHanNoodlesStore extends AbstractNoodlesStore {

    @Override
    AbstractNoodles createNoodles(String name) {
        return new WuHanNoodles(name);
    }
}
