package com.kenton.abstractfactory.product;

import com.kenton.abstractfactory.noodelsfactory.BaseNoodlesFactory;
import com.kenton.abstractfactory.product.material.ITopping;

/**
 * @author KentonLee
 * @date 2019/3/1
 */
public class WuHanNoodles extends AbstractNoodles {
    public WuHanNoodles (BaseNoodlesFactory factory){
        this.dough=factory.createDough();
        this.sauce=factory.createSauce();
        this.toppings=factory.createTopping();
        prepare();
        this.knead();
        this.boil();
        this.box();
    }
    @Override
    public void prepare() {
        StringBuilder sb = new StringBuilder("正在准备武汉热干面\n");
        this.prepareMaterial(sb);
    }

}
