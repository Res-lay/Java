package t8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of list --> ");
        int size = in.nextInt();
        Integer moveNumber = null;
//        WaitList<Integer> list = new WaitList<Integer>();
        BoundedWaitList<Integer> list = new BoundedWaitList<Integer>(size);
        UnfairWaitList<Integer> crazyList = new UnfairWaitList<Integer>();
        for (int i = 0; i < size; i ++){
            Integer number = in.nextInt();
            list.add(number);
            crazyList.add(number);
            moveNumber = number;
        }
        crazyList.moveToBack(moveNumber);
        System.out.println(list);
        System.out.println(moveNumber);
        System.out.println("-------------\n");
        System.out.println(crazyList);
    }
}