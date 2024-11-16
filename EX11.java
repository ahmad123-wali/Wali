package ex11;

import java.util.Scanner;

public class EX11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter a value for raduis");
        double raduis = input.nextDouble();
        if (raduis >= 0) {
            double area = 3.14 * raduis * raduis;
            System.out.println("The area is " + area);

        }

    }

}
