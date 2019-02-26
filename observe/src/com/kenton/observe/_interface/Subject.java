package com.kenton.observe._interface;

/**
 * @author KentonLee
 * @date 2019/2/26
 */
public interface Subject {
   /**
    * registerObserve
    * @param observe observe
    */
   void registerObserve(Observe observe);

   /**
    *  removeObserve
    * @param observe observe
    */
   void removeObserve(Observe observe);

   /**
    * 通知观察者，数据已经改变了
    */
   void notifyObserve();
}
