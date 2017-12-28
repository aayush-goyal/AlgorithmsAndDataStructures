package Stacks;

public class TwoStacksInAnArray {

    int size, array[], top1, top2;

    TwoStacksInAnArray(int n) {
        array = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if(top1<top2-1) {
            top1++;
            array[top1] = x;
        } else {
            System.out.println("Stack OverFlow");
        }
    }

    void push2(int x) {
        if(top1<top2-1) {
            top2--;
            array[top2] = x;
        } else {
            System.out.println("Stack OverFlow");
        }
    }

    int pop1() {
        if(top1 == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = array[top1];
            top1--;
            return x;
        }
    }

    int pop2() {
        if(top2 == size) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = array[top2];
            top2++;
            return x;
        }
    }

    public static void main(String args[]) {
        TwoStacksInAnArray ts = new TwoStacksInAnArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" + " stack2 is " + ts.pop2());
    }
}