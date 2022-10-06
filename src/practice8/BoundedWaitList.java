package practice8;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public void add(E element) {
        if (contents.size() < capacity) {
            super.add(element);
        } else if (contents.size() > capacity) {
            throw new Error("Error 404");
        }
    }
}
