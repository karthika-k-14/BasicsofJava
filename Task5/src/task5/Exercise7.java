package task5;

import java.util.LinkedHashSet;

public class Exercise7 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> regNos = new LinkedHashSet<>();

        regNos.add(201);
        regNos.add(202);
        regNos.add(203);
        regNos.add(201);
        regNos.add(204);
        regNos.add(202);

        System.out.println("Registration Numbers: " + regNos);
    }
}