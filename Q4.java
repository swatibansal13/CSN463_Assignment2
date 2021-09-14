package assignment2;

import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {
        smallestInt();
    }

    public static void smallestInt() {

        ArrayList<Long> sumList = new ArrayList<>();

        int i = 2;

        sumList.add(0, 3L);

        while (sumList.get(i - 2) != i * i) {

            System.out.println(i);

            sumList.add(i - 1, sumList.get(i - 2) + i);

            i++;

        }

        System.out.println(sumList.get(i - 2));

    }

}