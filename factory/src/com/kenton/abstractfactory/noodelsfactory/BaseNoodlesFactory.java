package com.kenton.abstractfactory.noodelsfactory;

import com.kenton.abstractfactory.product.material.IDough;
import com.kenton.abstractfactory.product.material.ISauce;
import com.kenton.abstractfactory.product.material.ITopping;

import java.util.List;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public interface  BaseNoodlesFactory {
     IDough createDough();
     ISauce createSauce();
     List<ITopping>  createTopping();
}
