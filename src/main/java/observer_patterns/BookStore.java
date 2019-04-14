package observer_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 书店发布新书 告诉所有的读者
 * Created by yang on 2019/4/11.
 */
public class BookStore implements Subject {

    String newBook;
    /**
     * d定义观察者列表
     */
    private List<Observer> observers = new ArrayList<Observer>();


    /**
     * 书店增加一个观察者
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    /**
     * 书店移除观察者
     *
     * @param o
     */
    public void removeObserver(Observer o) {
        if (observers.indexOf(o) > 0) {
            observers.remove(o);
        }

    }

    public void notifyObservers() {
        for (Observer observer : observers) {

            observer.update(newBook);

        }
    }

    /**
     * 书店新增了书
     *
     * @param newBook
     */
    public void setNewBook(String newBook) {
        this.newBook = newBook;
        //通知给读者
        notifyObservers();
    }


}
