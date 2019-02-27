package com.kenton;

import com.kenton.component.BaseBeverage;
import com.kenton.component.Tea;
import com.kenton.decorator.Ice;
import com.kenton.decorator.Sugar;

/**
 * @author KentonLee
 * @date 2019/2/27
 */
public class DecoratorMain {
    public static void main(String[] args) {
        BaseBeverage tea = new Tea();
        System.out.println("原味茶："+tea.getDescription()+","+tea.cost());
        //正确写法:饮料+糖+冰 之后还是饮料，所以不能返回Ice,Sugar对象
        tea =new Ice(tea);
        tea=new Sugar(tea);
        System.out.println(tea.getDescription()+","+tea.cost());
        //错误写法
//        Ice ice = new Ice(tea);
//        System.out.println(tea.getDescription()+","+tea.cost());
//        System.out.println("-----------------");
//        Sugar sugar = new Sugar(tea);
//        System.out.println(tea.getDescription()+","+tea.cost());

    }
}
