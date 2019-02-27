package com.kenton.decorator;


import com.kenton.component.BaseBeverage;

/**
 * @author KentonLee
 * @date 2019/2/27
 */
public class Ice extends BaseBurdening {
    private BaseBeverage baseBeverage;

    /**
     *  要往饮品中增加配料，所以要接受一个饮品对象
     * @param baseBeverage BaseBeverage
     */
    public Ice(BaseBeverage baseBeverage){
        this.baseBeverage=baseBeverage;
    }
    @Override
    public String getDescription() {
        return baseBeverage.getDescription()+",一份冰";
    }
    /**
     * 配料的花费+饮料的花费=总的花费
     * @return totalCost
     */
    @Override
    public double cost() {
        return 0.7+baseBeverage.cost();
    }
}
