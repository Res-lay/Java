package t12_15.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Address address = new Address();
        System.out.println("Введите строку: ");
//        Россия; Москва; г.Москва; ул.Никольская; д.4; 5; кв.42
//        Россия- Москва- г.Москва- ул.Никольская- д.4- 5- кв.42
//        Россия. Москва. г.Москва. ул.Никольская. д.4. 5.. кв.42

        address.Separate(in.nextLine());
        System.out.println(address.toString());
    }
}
