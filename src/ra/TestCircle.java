package ra;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = circle.getRadius();
        System.out.println("Bán kính: " + radius);
        double area = circle.getArea();
        System.out.println("Diện tích: " + area);
    }
}