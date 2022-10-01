package t9;

public class Client {

    private String FIO = "";
    private String INN = "";

    Client(String FIO, String INN){
        this.INN = INN;
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public String getINN() {
        return INN;
    }
}
