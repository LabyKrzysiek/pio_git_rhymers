package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_STACK = -1;
    private static final int STACK_FULL = 11;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_STACK;

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getEmptyStack() {
        return EMPTY_STACK;
    }

    public static int getStackFull() {
        return STACK_FULL;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK;
    }

    public boolean isFull() {
        return total == STACK_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK;
        return numbers[total--];
    }
}