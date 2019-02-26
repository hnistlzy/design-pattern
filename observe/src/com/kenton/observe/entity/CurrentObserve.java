package com.kenton.observe.entity;

import com.kenton.observe._interface.Observe;
import com.kenton.observe._interface.Subject;

/**
 * @author KentonLee
 * @date 2019/2/26
 */
public class CurrentObserve implements Observe {
    private Paper paper;
    private Subject subject;

    public CurrentObserve(Subject subject){
        this.subject=subject;
        this.subject.registerObserve(this);
    }


    private  void display(){
        System.out.println(paper);
    }

    @Override
    public void update(Paper paper) {
        this.paper=paper;
        display();
    }
}
