package task5;

import java.util.TreeSet;

public class Exercise9 {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(70);
        marks.add(90);
        marks.add(65);
        marks.add(95);

        System.out.println("Marks: " + marks);
        System.out.println("Descending: " + marks.descendingSet());
        System.out.println("First Mark: " + marks.first());
        System.out.println("Last Mark: " + marks.last());

        System.out.println("Contains 70: " + marks.contains(70));
        System.out.println("Less than 85: " + marks.headSet(85));
        System.out.println("Greater than or Equal 85: " + marks.tailSet(85));

        marks.remove(70);

        System.out.println("After Removal: " + marks);
        System.out.println("Total Marks: " + marks.size());
    }
}