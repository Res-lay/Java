package t12_15.Ex2;

public class Address {

    private String Country;
    private String Region;
    private String City;
    private String Street;
    private String House;
    private String Building;
    private String Flat;


    public void Separate(String str){
        String[] arr = str.split("(, )|(. )|(; )|(- )");
        Country = arr[0];
        Region = arr[1];
        City = arr[2];
        Street = arr[3];
        House = arr[4];
        Building = arr[5];
        Flat = arr[6];
    }


    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", Region='" + Region + '\'' +
                ", City='" + City + '\'' +
                ", Street='" + Street + '\'' +
                ", House='" + House + '\'' +
                ", Building='" + Building + '\'' +
                ", Flat='" + Flat + '\'' +
                '}';
    }
}
