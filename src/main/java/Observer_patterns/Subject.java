package Observer_patterns;

/**
 * 当主题状态改变时，这个方法会调用，以通知所有的观察者
 * Created by yang on 2019/4/11.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();


}
