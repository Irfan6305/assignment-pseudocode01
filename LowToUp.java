import java.util.Scanner;

public class LowToUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);

        if(ch>=97 && ch<=122){
            char up=(char)(ch-'a'+'A');
            System.out.println(up);
        }
        if(ch>=65 &&ch<=90){
            char lo=(char)(ch-'A'+'a');
            System.out.println(lo);
        }
        else{
            System.out.println("we cannot convert a non alphabet value to  alphabet values");
        }

    }
}