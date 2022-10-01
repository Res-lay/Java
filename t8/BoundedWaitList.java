package t8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (content.size() < capacity) {
            super.add(element);
        } else if (content.size() == capacity) {
            throw new Error("No more free space");
        }
    }
}
//    @Override
//    public String toString() {
//        return "BoundedWaitList{" +
//                "capacity=" + capacity +
//                '}';
//    }
//}
