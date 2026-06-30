package task5;

import java.util.HashSet;

public class Exercise6 {
    public static void main(String[] args) {

        HashSet<Integer> rollNos = new HashSet<>();

        rollNos.add(101);
        rollNos.add(102);
        rollNos.add(103);
        rollNos.add(101);
        rollNos.add(104);
        rollNos.add(102);

        System.out.println("Final Roll Numbers: " + rollNos);
    }
}