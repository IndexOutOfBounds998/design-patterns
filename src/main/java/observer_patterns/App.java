package observer_patterns;

/**
 * Created by yang on 2019/4/11.
 */
public class App {

    public static void main(String[] args) {

        BookStore bookStorm = new BookStore();
        Observer observer = new StudentObs("李明", bookStorm);
        bookStorm.setNewBook("世说新语");

        bookStorm.setNewBook("新三国");

        bookStorm.setNewBook("java");

        bookStorm.setNewBook("php");

        bookStorm.setNewBook("py");
    }
}
