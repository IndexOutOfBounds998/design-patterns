package observer_patterns;

/**
 * 学生观察者
 * Created by yang on 2019/4/11.
 */
public class StudentObs implements Observer, DisplayElement {

    String newBook;

    String name;

    Subject subject;

    public StudentObs(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public StudentObs(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update(Object o) {
        this.newBook = (String) o;
        disPlay();
    }

    public void disPlay() {
        System.out.println(name + "同学:书店发布新书【" + newBook + "】快来看呐！");
    }
}
