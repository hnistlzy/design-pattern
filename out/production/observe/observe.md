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
```java

```
