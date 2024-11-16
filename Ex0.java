package ex0;

import java.util.Scanner;

public class Ex0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter student average");
        double avg = input.nextDouble();
        if (avg >= 90) {
            System.out.println("The student is grad A");
        } else if (avg >= 80) {
            System.out.println("The student is grad B");
        } else if (avg >= 70) {
            System.out.println("The student is grad C");
        } else if (avg >= 60) {
            System.out.println("The student is grad D");
        } else if (avg >= 55) {
            System.out.println("The student is gra E");
        } else {
            System.out.println("The student is failed");
        }
    }

}
