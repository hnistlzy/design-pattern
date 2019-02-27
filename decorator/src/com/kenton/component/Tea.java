package com.kenton.component;

/**
 * @author KentonLee
 * @date 2019/2/27
 */
public class Tea extends BaseBeverage  {
    public Tea(){
        description="抹茶";
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return 5;
    }
}
