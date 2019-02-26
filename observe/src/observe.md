#设计模式之观察者模式
## 背景
有一软件具有订阅（关注）功能，当你订阅（关注）了某个专栏（作者）后，此专栏（作者）一旦有文章更新，就立即通知订阅者。
一般而言，被订阅的专栏都不止有一个粉丝，所以此处应为one2many。既然有订阅功能，所以也应该有取消订阅功能，而且一旦选择取消订阅，该作者更新时，订阅者将不能再收到消息推送。
## 接口定义
订阅操作应为app的固有能力，不能向某一特定的专栏（作者）开放，也不能向某一特定粉丝开放。所以，应当采用面向接口编程的方式实现这一功能。

专栏接口：
```java
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
```
观察者接口：
```java
public interface Observe {

    /**
     *  更新本地的消息
     * @param title title
     * @param content content
     * @param author author
     */
    void update(String title, String content, String author);
}
```
只要实现了Subject接口，这个专栏就可以向他的粉丝们推送新消息通知啦
```java
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
```
只要实现了Observe接口就是观察者了，此时它就可以接受到专栏（作者）更新文章后的通知了
```java
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
```
