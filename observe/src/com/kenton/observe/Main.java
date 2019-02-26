package com.kenton.observe;

import com.kenton.observe.entity.ConcreteSubject;
import com.kenton.observe.entity.CurrentObserve;

/**
 * @author KentonLee
 * @date 2019/2/26
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        CurrentObserve currentObserve = new CurrentObserve(concreteSubject);
        //测试通知
        concreteSubject.setPaper("现有java开发的模式的问题","我看现在的j2se的开发模式不爽，所以我写了个框架叫做spring","Rod Johnson");
        //测试移除
        concreteSubject.removeObserve(currentObserve);
        concreteSubject.setPaper("现有java开发的模式的问题","我看现在的j2se的开发模式不爽，所以我写了个框架叫做spring","rod johnson");
    }
}
