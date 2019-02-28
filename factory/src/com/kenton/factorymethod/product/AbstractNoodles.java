package com.kenton.factorymethod.product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public abstract class AbstractNoodles {
    /**
     *面条种类
     */
    String name;
    /**
     * 面团
     */
    String dough;
    /**
     * 酱料
     */
    String sauce;
    /**
     * 其他的配料
     */
    List<String> topping=new ArrayList<>();

   public  void prepare(){
        System.out.println("顾客所需要的面条是："+name);
        System.out.println("Preparing。。。"+dough);
        System.out.println("Preparing。。。"+sauce);
       for (String toppingName : topping) {
           System.out.println("Preparing。。。"+toppingName);
       }
    }
    public   void knead(){
        System.out.println("正在揉面。。。。");
    }
    public void boil(){
        System.out.println("正在煮面");
    }

    public void box(){
        System.out.println("正在搭配所有配料，并放入碗中");
    }
}
