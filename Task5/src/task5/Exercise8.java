package task5;

import java.util.TreeSet;

public class Exercise8 {
    public static void main(String[] args) {

        TreeSet<Integer> ids = new TreeSet<>();

        ids.add(105);
        ids.add(102);
        ids.add(109);
        ids.add(101);
        ids.add(103);
        ids.add(102);

        for (int id : ids) {
            System.out.println(id);
        }
    }
}