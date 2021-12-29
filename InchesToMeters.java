import java.util.Scanner;

public class InchesToMeter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value in inches");
        double a=sc.nextInt();
        System.out.println("result in meter");
        double b=a/40;
        System.out.println(b);
    }
}
