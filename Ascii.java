package irfan;
import java.util.Scanner;

public class Ascii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.nextLine().charAt(0);
        System.out.println("Enter the  value you want to add in  Ascii value of  character");
        int n=sc.nextInt();
        int value=ch+n;
        char result=(char)value;
        System.out.println(result);

    }
}