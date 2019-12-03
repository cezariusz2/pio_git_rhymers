package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int total_numbers = 12;
    public static final int TOTAL = -1;
    public static final int fullSize = 11;
    private int[] numbers = new int[total_numbers];

    public int total = TOTAL;



    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() { return total == fullSize; }

    protected int countIn() {
        if (callCheck())
            return TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return numbers[total--];
    }

}
