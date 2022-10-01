package t7;

import java.util.ArrayDeque;
import java.util.Scanner;


public class NewArrayDeque {
    private  ArrayDeque<Integer> states1 = new ArrayDeque<>();
    private ArrayDeque<Integer> states2 = new ArrayDeque<>();

    public void fill() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            states1.push(input.nextInt());
        }
        for (int i = 0; i < 5; i++){
            states2.push(input.nextInt());
        }

    }

    public String startGame(){
        Integer counter = 0;
        String winner = "";
        while ((states1.peek() != null) && (states2.peek() != null) && (counter < 106)){
            if (states1.peekLast() > states2.peekLast()){ //offer, poll, peek
                if(states2.peekLast() == 0 && states1.peekLast() == 9) {
                    states2.push(states2.pollLast());
                    states2.push(states1.pollLast());
                }
                else {
                    states1.push(states1.pollLast());
                    states1.push(states2.pollLast());
                }
            }
            else if (states1.peekLast() < states2.peekLast()){
                if(states1.peekLast() == 0 && states2.peekLast() == 9) {
                    states1.push(states1.pollLast());
                    states1.push(states2.pollLast());
                }
                else {
                    states2.push(states2.pollLast());
                    states2.push(states1.pollLast());
                }
            }
            counter ++;
        }
        if (states1.peek() == null) {
            winner = "second";
        }
        else {
            winner = "first";
        }
        return winner + " " + counter;
    }
}
