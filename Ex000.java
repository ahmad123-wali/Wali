package ex000;

import java.util.Scanner;

public class Ex000 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value");
        int S = input.nextInt();
        if (S % 2 == 0 ^ S % 3 == 0) {
            System.out.println("This number is full divisible on 2^3");
        } else {
            System.out.println("This number is not divisible on 2^3");
        }
    }

}
