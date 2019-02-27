package com.kenton.decorator;

import com.kenton.component.BaseBeverage;


/**
 * @author KentonLee
 * @date 2019/2/27
 */
public class Sugar extends BaseBurdening {
    private BaseBeverage baseBeverage;
    public Sugar( BaseBeverage baseBeverage ){
        this.baseBeverage=baseBeverage;
    }
    @Override
    public String getDescription() {
        return baseBeverage.getDescription()+",单糖";
    }

    /**
     * 配料的花费+饮料的花费=总的花费
     * @return totalCost
     */
    @Override
    public double cost() {
        return 0.5+baseBeverage.cost();
    }
}
