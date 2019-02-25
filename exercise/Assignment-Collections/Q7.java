//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.Collections;
import java.util.LinkedList;

class SpecialStack
{
    private final int MAXSIZE = 100;
    private LinkedList<Integer> stack = new LinkedList<>();

    public void push(int element){
        stack.push(element);
    }
    public int pop(){

        return stack.pop();
    }
    public boolean isFull(){
        return (stack.size() == MAXSIZE);
    }
    public boolean isEmpty(){
        return (stack.size() == 0);
    }
    public int getMin(){
        return Collections.min(stack);
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}

public class Q7 {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();

        System.out.println("Stack : " + s);

        System.out.println("Is Empty: " + s.isEmpty());

        s.push(2);
        s.push(10);
        s.push(5);
        s.push(20);
        s.push(7);

        System.out.println("Stack : " + s);

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Is Full: " + s.isFull());

        System.out.println("Is Empty: " + s.isEmpty());

        System.out.println("Minimum Element: " + s.getMin());

        System.out.println("Popped: " + s.pop());
        System.out.println("Minimum Element: " + s.getMin());

        System.out.println("Stack : " + s);

    }
}
