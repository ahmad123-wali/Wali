package javaapplication33;

import java.util.Scanner;

public class JavaApplication33 {

    public static void main(String[] args) {
        System.out.println("please enter  dollar amount");
        Scanner input = new Scanner(System.in);
        double dunit = input.nextInt();
        int dunitInteger = (int) dunit;
        double dunitDecimal = dunit - dunitInteger;
        double qauter, dimmes, nickle, pennis;
        qauter = dunitInteger * 4d;
        dimmes = dunitInteger * 10d;
        nickle = dunitInteger * 100d;
        pennis = dunitDecimal / 5d;
        System.out.println("The amount in qauarter is " + qauter);
        System.out.println("The amount in is dimmes " + dimmes);
        System.out.println("The amount in nickle is " + nickle);
        System.out.println("The amount in pennis is " + pennis);
    }

}
