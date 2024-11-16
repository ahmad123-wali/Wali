package homework2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value to check");
        int value = input.nextInt();
        if (value % 5 == 0) {
            System.out.println("hi five");
        }
        if (value % 2 == 0) {
            System.out.println("hi even");
        }
    }

}
