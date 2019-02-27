package com.kenton.component;

/**
 * @author KentonLee
 * @date 2019/2/27
 */
public abstract class BaseBeverage {
    String description;

    /**
     * 饮品描述
     * @return description
     */
    public String getDescription(){
        return description;
    }

    /**
     *  计算成本
     * @return  cost
     */
    public abstract double cost();
}
