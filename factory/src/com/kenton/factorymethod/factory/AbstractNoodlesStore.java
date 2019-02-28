package com.kenton.factorymethod.factory;

import com.kenton.factorymethod.product.AbstractNoodles;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public abstract class AbstractNoodlesStore {
    /**
     * 用户下订单，并根据不同的面条种类来烹饪面条
     * @param name noodlesTypeName
     * @return  AbstractNoodles
     */
    public AbstractNoodles orderNoodles(String name){
        AbstractNoodles noodles;
        noodles=createNoodles(name);

        noodles.prepare();
        noodles.knead();
        noodles.boil();
        noodles.box();

        return noodles;
    }

    /**
     * 新建披萨实体类的工厂方法
     * @param name  name
     * @return AbstractNoodles
     */
    abstract AbstractNoodles createNoodles(String name);
}
