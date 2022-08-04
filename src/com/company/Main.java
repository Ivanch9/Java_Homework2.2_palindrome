package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        int low, high;
        boolean isPalindrome;

        Scanner input = new Scanner(System.in);

        System.out.print("Vvedite stroky bez probelov: ");
        s = input.nextLine();

        // индекс начала строки
        low = 0;

        // индекс конца строки
        high = s.length() - 1;

        // Проверка
        isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println(s + " is Palindrome");
        else
            System.out.println(s + " is not Palindrome");
    }
}
