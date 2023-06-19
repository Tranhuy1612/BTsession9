import rikkei.academy.Circle;
import rikkei.academy.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 3, 4);
        Circle circle = new Circle("blue", 3);
        rectangle.display();
        System.out.println("Rectangle Area \uD83D\uDE0A\uD83D\uDE0A\uD83D\uDE0A :" + rectangle.getArea());
        System.out.println("Circle Area : " + circle.getArea());
    }
}
