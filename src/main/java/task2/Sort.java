package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Oleksandra", "Petro", "Leonid",
                "Maks", "Masha", "Andriy", "Orest", "Anna", "Viktoria");

        List<String> newNames = new ArrayList<>();

        names.stream()
                .sorted()
                .forEach(s -> newNames.add(0, s.toUpperCase()));

        System.out.println("newNames = " + newNames);
        System.out.println("listStream = " + names);
    }
}