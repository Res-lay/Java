package t7;

public class Main {

    public static void main(String[] args) {
        NewArrayDeque st = new NewArrayDeque();
        st.fill();
        System.out.println(st.startGame());

        NewQueue q = new NewQueue();
        q.fill();
        System.out.println(q.startGame());
    }

}