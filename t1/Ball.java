package t1;

public class Ball {
    private String colour;
    private int size;

    public Ball(int size, String colour)
    {
        this.size = size;
        this.colour = colour;
    }

    public Ball(int size)
    {
        this.size = size;
        colour = "green";
    }

    public Ball()
    {
        size = 50;
        colour = "green";
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String toString() {
        return "Colour: " + this.colour + ", Size: " + this.size;
    }
}
