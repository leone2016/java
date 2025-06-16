package HackerRank.Day1;


import java.util.Scanner;

public class CamelCaseProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(";");
            String op = parts[0];
            String type = parts[1];
            String value = parts[2];

            if (op.equals("S")) {
                // Remove () if method
                if (type.equals("M") && value.endsWith("()")) {
                    value = value.substring(0, value.length() - 2);
                }

                // Insert spaces before uppercase letters
                StringBuilder result = new StringBuilder();
                for (char c : value.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        result.append(" ");
                        result.append(Character.toLowerCase(c));
                    } else {
                        result.append(c);
                    }
                }
                System.out.println(result.toString());

            } else if (op.equals("C")) {
                //Integer e
                String[] words = value.split(" ");
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (i == 0 && !type.equals("C")) {
                        result.append(word.toLowerCase());
                    } else {
                        result.append(Character.toUpperCase(word.charAt(0)))
                                .append(word.substring(1));
                    }
                }

                if (type.equals("M")) {
                    result.append("()");
                }

                System.out.println(result.toString());
            }
        }
    }
}
