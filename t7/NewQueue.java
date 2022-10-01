package t7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class NewQueue {
    private Queue<Integer> states1 = new LinkedList<>();
    private Queue<Integer> states2 = new LinkedList<>();


    public void fill() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            states1.offer(input.nextInt());
        }
        for (int i = 0; i < 5; i++){
            states2.offer(input.nextInt());
        }

    }

    public String startGame(){
        Integer counter = 0;

        while(counter < 106 && !states1.isEmpty() && !states2.isEmpty()){
            if (states1.peek() > states2.peek()){
                if (states1.peek() == 9 && states2.peek() == 0){
                    states2.offer(states2.poll());
                    states2.offer(states1.poll());
                }
                else{
                    states1.offer(states1.poll());
                    states1.offer(states2.poll());
                }
            }

            else if (states2.peek() > states1.peek()){
                if (states1.peek() == 0 && states2.peek() == 9){
                    states1.offer(states1.poll());
                    states1.offer(states2.poll());
                }
                else{
                    states2.offer(states2.poll());
                    states2.offer(states1.poll());
                }
            }
            counter ++;
        }
        if (states1.isEmpty()){
            return ("second " + counter);
        }
        else{
            return ("first " + counter);
        }
    }
}
