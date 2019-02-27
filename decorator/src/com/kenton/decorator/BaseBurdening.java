package com.kenton.decorator;

import com.kenton.component.BaseBeverage;


/**
 * @author KentonLee
 * @date 2019/2/27
 */
public abstract class BaseBurdening  extends BaseBeverage {
    /**
     *  配料的描述
     * @return  description
     */
    @Override
    public abstract String getDescription();

    /**
     *  配料的花费
     * @return cost
     */
    @Override
    public  abstract double cost();
}
