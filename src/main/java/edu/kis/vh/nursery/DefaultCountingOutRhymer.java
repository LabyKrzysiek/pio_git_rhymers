package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_STACK = -1;
    public static final int STACK_FULL = 11;
    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY_STACK;

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