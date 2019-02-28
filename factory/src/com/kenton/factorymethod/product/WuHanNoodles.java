package com.kenton.factorymethod.product;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public class WuHanNoodles extends AbstractNoodles {
    public WuHanNoodles(String name){
        this.name=name;
        sauce="芝麻酱";
        dough="碱面";
        topping.add("豌豆");
        topping.add("剁辣椒");
    }

    @Override
    public void knead() {
        System.out.println("不需要揉面，碱面直接从超市里买");
    }
}
