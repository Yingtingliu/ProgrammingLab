package DSA.DSA_Ch8_practice;


import java.util.ArrayList;
import java.util.LinkedList;

public class TestAddLast {
    public static void main(String[] args) {
        int n = 1000000;
        
        // Test addLast for ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time taken for addLast in ArrayList: " + duration + " ns");

        // Test addLast for LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time taken for addLast in LinkedList: " + duration + " ns");
    }
}