package t3.Ex1;

public class Circle extends Shape {
    private double radius;

    public Circle()
    {
        this.radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "It's a circle; radius: " + this.radius + ", color: " + this.color + ", field: " + this.filled;
    }
}
