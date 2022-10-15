package t12_15.Ex3;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = "S001,Black Polo Shirt,Black,XL";
        array[1] = "S002,Black Polo Shirt,Black,L";
        array[2] = "S003,Blue Polo Shirt,Blue,XL";
        array[3] = "S004,Blue Polo Shirt,Blue,M";
        array[4] = "S005,Tan Polo Shirt,Tan,XL";
        array[5] = "S006,Black T-Shirt,Black,XL";
        array[6] = "S007,White T-Shirt,White,XL";
        array[7] = "S008,White T-Shirt,White,L";
        array[8] = "S009,Green T-Shirt,Green,S";
        array[9] = "S010,Orange T-Shirt,Orange,S";

        Shirt[] shirts = new Shirt[10];
        String[] param;

        for(int i = 0; i < 10; i++) {
            param = array[i].split(",");
            shirts[i] = new Shirt(param[0],param[1],param[2],param[3]);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(shirts[i].toString());
        }
    }
}
