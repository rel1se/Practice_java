package practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){
        super();
    }
    public void remove(E element) {
        contents.remove(element);
    }
    void moveToBack(E element){
        if (contents.remove(element)){
            ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
            temp.add(element);
            temp.addAll(contents);
            contents = temp;
        }
    }
}
