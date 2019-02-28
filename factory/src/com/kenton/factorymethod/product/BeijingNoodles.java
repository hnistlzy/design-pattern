package com.kenton.factorymethod.product;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public class BeijingNoodles extends AbstractNoodles {
    public BeijingNoodles(String name){
        this.name=name;
        sauce="甜面酱";
        dough="宽面条";
        topping.add("西红柿");
        topping.add("黄瓜");
        topping.add("大蒜");
    }
}
