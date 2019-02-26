package com.kenton.observe.entity;

import com.kenton.observe._interface.Observe;
import com.kenton.observe._interface.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KentonLee
 * @date 2019/2/26
 */
public class ConcreteSubject implements Subject {
    private List<Observe> observeList;
    private Paper paper;

    public ConcreteSubject(){
        observeList=new ArrayList<>();
        paper=new Paper();
    }

    @Override
    public void registerObserve(Observe observe) {
        observeList.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        if(!observeList.isEmpty()){
            observeList.remove(observe);
        }
    }

    @Override
    public void notifyObserve() {
        if(!observeList.isEmpty()){
            for (Observe observe : observeList) {
                observe.update(paper);
            }
        }
    }

    /**
     * 当学生信息发生改变时，通知观察者
     */
    private void paperChanged(){
        notifyObserve();
    }

    public void setPaper(String title, String content, String author){
        paper.setTitle(title);
        paper.setContent(content);
        paper.setAuthor(author);
        paperChanged();
    }
}
