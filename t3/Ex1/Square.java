package t3.Ex1;

public class Square extends Rectangle{
    public Square()
    {
        super(1,1);
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return super.getWidth();
    }

    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "It's a square, side: " + super.getWidth() + " color: " + this.color + " filled: " + this.filled;
    }
}
