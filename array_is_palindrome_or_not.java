package irfan_khan;

import java.util.Scanner;

public class Array_is_palindrome_or_not {
    public static void main(String[] args) {
        int mark[]=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            mark[i]=sc.nextInt();
        }
        boolean palindrome=true;
        for(int j=0;j<=5/2;j++){
            if(mark[j]!=mark[5-j-1]){
                palindrome=false;
            }
        }
        if(palindrome){
            System.out.println("it is  palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
