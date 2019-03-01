package com.kenton.abstractfactory.product;

import com.kenton.abstractfactory.noodelsfactory.BaseNoodlesFactory;
import com.kenton.abstractfactory.product.material.ITopping;

/**
 * @author KentonLee
 * @date 2019/3/1
 */
public class BeijingNoodles extends AbstractNoodles {
    public BeijingNoodles(BaseNoodlesFactory factory){
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
        StringBuilder sb = new StringBuilder("正在准备老北京炸酱面\n");
        this.prepareMaterial(sb);
    }
}
