import java.util.ArrayList;

public class QueueNumber<T> {

    private ArrayList<T> queueNumber= new ArrayList<>();

    public boolean isEmpty() {
        return queueNumber.isEmpty();
    }
    public void enqueue(T x) {
        queueNumber.add(x);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T result = queueNumber.get(0);
        queueNumber.remove(0);
        return result;
    }

    public T front(){
        if (isEmpty()){
            return null;
        }
        return queueNumber.get(0);
    }

    public int size(){
        return queueNumber.size();
    }
}
