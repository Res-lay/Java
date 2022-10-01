package t1215.Ex3;

public class Shirt {

    String code;
    String name;
    String color;
    String size;

    Shirt(String code, String name, String color, String size){
        this.code = code;
        this.size = size;
        this.color = color;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Shirt{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
