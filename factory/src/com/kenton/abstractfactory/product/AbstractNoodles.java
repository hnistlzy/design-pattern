package com.kenton.abstractfactory.product;

import com.kenton.abstractfactory.product.material.IDough;
import com.kenton.abstractfactory.product.material.ISauce;
import com.kenton.abstractfactory.product.material.ITopping;

import java.util.List;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public  abstract  class AbstractNoodles {
    protected IDough dough;
    protected ISauce sauce;
    protected List<ITopping> toppings;

    public abstract void prepare();

    public   void knead(){
        System.out.println("正在揉面。。。。");
    }
    public void boil(){
        System.out.println("正在煮面");
    }

    public void box(){
        System.out.println("正在搭配所有配料，并放入碗中");
    }

    public void prepareMaterial(StringBuilder sb) {
        sb.append(dough.getDoughName()).append(",").append(sauce.getSauceName()).append(",");
        for(ITopping topping:toppings){
            sb.append(topping.getToppingName()).append(",");
        }
        System.out.println(sb.toString());
    }

}
