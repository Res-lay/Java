package t9;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Client{
    Main(String FIO, String INN) {
        super(FIO, INN);
    }

    public static void main(String[] args) throws IOException{
        Client[] arr = new Client[5];
        arr[0] = new Client("Мельникова Ксения Витальевна", "456987512563");
        arr[1] = new Client("Пименов Максим Евгеньевич", "1236985478541");
        arr[2] = new Client("Иванова София Ивановна", "698512745632");
        arr[3] = new Client("Лебедева Екатерина Сергеевна", "985321469874");
        arr[4] = new Client("Сапсай Иван Алексеевич", "9532167459823");


        Scanner input = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String fio = input.nextLine();
        System.out.println("Введите ИНН:");
        String inn = input.nextLine();

        boolean flag = false;
        for(int i = 0; i < 5; i++){
            if(arr[i].getFIO().equals(fio)){
                try {
                    if (!arr[i].getINN().equals(inn)) {throw new IOException();}
                    System.out.println("Клиент найден!");
                } catch (IOException e) {
                    System.out.println("Данный клиент не найден!");
                }
                finally {
                    System.out.println("-----------------------");
                }
            }
        }
    }
}

