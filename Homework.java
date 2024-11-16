package homework;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me your weghit");
        double w = input.nextDouble();
        System.out.println("Give me your height");
        double h = input.nextDouble();
        double BMI = w /h*h;
        if (BMI <18.5) {
            System.out.println("under weight");
        } else if (BMI>=18.5 && BMI<25.0) {
            System.out.println("Normal");
        } else if (BMI >=25.0 && BMI<30.0) {
            System.out.println("overweight");
        } else if(BMI>=30.0){
            System.out.println("obese");
        }
    }
}


