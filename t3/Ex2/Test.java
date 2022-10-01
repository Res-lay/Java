package t3.Ex2;

public class Test {
    public static void exec()
    {
        MovablePoint point1 = new MovablePoint(10, 5, 10, 15);
        System.out.println(point1);
        point1.moveDown();
        point1.moveRight();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(10, 5, 10, 15, 150);
        System.out.println(circle1);
        circle1.moveLeft();
        circle1.moveDown();
        System.out.println(circle1);
    }
}
