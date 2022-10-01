package t8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){
        super();
    }
    void remove(E element){
        content.remove(element);
    }

    void moveToBack(E element){
        if(content.remove(element)) {
            ConcurrentLinkedQueue<E> new_content = new ConcurrentLinkedQueue<E>();

            new_content.add(element);
            new_content.addAll(content);
            content = new_content;
        }
    }
}
