package com.kenton.factorymethod.factory;

import com.kenton.factorymethod.product.AbstractNoodles;
import com.kenton.factorymethod.product.BeijingNoodles;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public class BeijingNoodlesStore extends AbstractNoodlesStore {
    @Override
    AbstractNoodles createNoodles(String name) {
        return new BeijingNoodles(name);
    }
}
