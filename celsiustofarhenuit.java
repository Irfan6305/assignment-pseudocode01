package irfan;
import java.util.Scanner;

public class CelsiusToFarhenuit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in fernite");
        int a= sc.nextInt();
        double b= (a-32)/1.8;

        System.out.println("celsius value of the Farhenuit value is  "+b);
    }
}
