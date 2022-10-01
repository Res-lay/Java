package t1;

public class TestBall {
    public static void exec() {
        Ball ball1 = new Ball(120, "red");
        Ball ball2 = new Ball(100);

        ball2.setColour("blue");
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
