package task1;

public class PrintOddNameTask {
    public static void main(String[] args) {
        String[] names = new String[]{"Ivan", "Oleksandra", "Petro", "Leonid",
                "Maks", "Masha", "Andriy", "Orest", "Anna", "Viktoria"};

        PrintName printOddName = array -> {
            String result = "";
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    result += i + ". " + array[i];
                }

                if (i % 2 != 0 && i < array.length - 1) {
                    result += ", ";
                }
            }
            return result;
        };

        System.out.println("printOddName = " + printOddName.print(names));
    }
}