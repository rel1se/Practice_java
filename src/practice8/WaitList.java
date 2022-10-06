package practice8;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> contents;
    WaitList(){
        contents = new ConcurrentLinkedQueue<>();
    }
    WaitList(Collection<E> c){
        contents = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public void add(E element) {
        contents.add(element);
    }

    @Override
    public E remove() {
        return contents.remove();
    }

    @Override
    public boolean contains(E element) {
        return contents.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return contents.contains(c);
    }

    @Override
    public boolean isEmpty() {
        return contents.isEmpty();
    }
    public String toString() {
        String res = "";
        for (E e : contents) {
            res += (e.toString() + "\n");
        }
        return res;
    }
}
