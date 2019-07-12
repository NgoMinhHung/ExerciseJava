package OOP;

import java.util.ArrayList;

public class StackNumber<T> {

    private ArrayList<T> stackNumber = new ArrayList<>();

    public boolean isEmpty(){
        return stackNumber.isEmpty();
    }

    public void push(T number){
        stackNumber.add(number);
    }

    public T pop(){
        if (isEmpty()){
            return null;
        }else{
            int topIndex = stackNumber.size() - 1;
            T result = stackNumber.get(topIndex);
            stackNumber.remove(result);
            return result;
        }
    }

}
