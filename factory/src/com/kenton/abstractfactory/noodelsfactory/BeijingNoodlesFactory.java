package com.kenton.abstractfactory.noodelsfactory;

import com.kenton.abstractfactory.product.concretematerial.BeijingTopping;
import com.kenton.abstractfactory.product.concretematerial.HandmadeNoodles;
import com.kenton.abstractfactory.product.concretematerial.SweetSauce;
import com.kenton.abstractfactory.product.material.IDough;
import com.kenton.abstractfactory.product.material.ISauce;
import com.kenton.abstractfactory.product.material.ITopping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KentonLee
 * @date 2019/3/1
 */
public class BeijingNoodlesFactory  implements BaseNoodlesFactory{
    @Override
    public IDough createDough() {
        return new HandmadeNoodles();
    }

    @Override
    public ISauce createSauce() {
        return new SweetSauce();
    }

    @Override
    public List<ITopping> createTopping() {
        List<ITopping> toppings =new ArrayList<>();
        toppings.add(new BeijingTopping("黄瓜"));
        toppings.add(new BeijingTopping("西红柿"));
        return toppings;
    }
}
