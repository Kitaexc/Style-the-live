import java.util.Scanner;
public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (для выхода введите 'пакеда'): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("пакеда")) {
                break;
            }

            if (isPalindrome(userInput)) {
                System.out.println("Это палиндром!");
            } else {
                System.out.println("Все не то давай по новой.");
            }
        }

        scanner.close();
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "").toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

