import figure.Circle;
import figure.Rectangle;
import figure.Triangle;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(4, 6,8);

        System.out.println("Площадь круга: " + circle.getSquare() + "\nПериметр круга: " + circle.getPerimeter());
        System.out.println(" ");
        System.out.println("Площадь прямоугольника: " + rectangle.getSquare() + "\nПериметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println(" ");
        System.out.println("Площадь треугольника: " + triangle.getSquare() + "\nПериметр треугольника: " + triangle.getPerimeter());
    }
}
