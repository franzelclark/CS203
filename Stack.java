public class Stack<T> {
    private int maxStkSize = 100;
    private int top = -1;
    private Object[] stk;

    public Stack() {
        stk = new Object[maxStkSize];
    }

    public Stack(int n) {
        if (n > 0) maxStkSize = n;
        stk = new Object[maxStkSize];
    }

//    Object[] newStack(T myStack, int n) {
//        maxStkSize = n;
//        top = -1;
//        stk = new Object[maxStkSize];
//        return stk;
//    }

    void push(T pushInput) {
        stk[++top] = pushInput;
        System.out.println("\nPushed \"" + pushInput + "\" to the stack.");

    }

    void pop() {
        if (!isEmpty()) {
            System.out.println("\n*Pop* goes " + stk[top] + "!");
            top--;
        } else System.out.println("\nThere's nothing to pop");
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("\n" + stk[top]);
        } else System.out.println("\nThere's nothing to peek");
    }

    boolean isEmpty() {
        if (top == -1) {
            //System.out.println("Stack empty");
            return true;
        } else return false;
    }

    boolean isFull() {
        if (top == ((maxStkSize - 1))) {
            //System.out.println("Stack is full");
            return true;
        } else return false;
    }

    void clear() {
        top = -1;
        System.out.println("\nStack has been cleared");
    }

    void viewStack() {
        if (isEmpty()) {
            System.out.println("\nStack is empty");
        } else {
            System.out.println();
            for (int i = top; i >= 0; i--) {
                System.out.println(stk[i]);
            }
        }
    }

    void viewAll() {
        System.out.println();
        for (int i = stk.length - 1; i >= 0; i--) {
            System.out.print("\n" + stk[i]);
            if (i == top) {
                System.out.print(" <---");
            }
            if (i == 0) {
                System.out.println();
            }
        }
    }
}