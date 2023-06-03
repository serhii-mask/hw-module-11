package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};

        List<Integer> sortedNumbers = Arrays.asList(numbers).stream()
                .map(s -> refactoringString(s))
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("sorted = " + sortedNumbers);
    }

    private static List<Integer> refactoringString(String str) {
        List<Integer> integerNumbers = new ArrayList<>();
        String newStr = str.replace(",", "").replace(" ", "");

        for (int i = 0; i < newStr.length(); i++) {
            integerNumbers.add(Integer.parseInt(String.valueOf(newStr.charAt(i))));
        }

        return integerNumbers;
    }
}
