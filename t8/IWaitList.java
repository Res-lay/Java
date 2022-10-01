package t8;

import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containAll(Collection<E> c);
    boolean isEmpty();
}
