package irfankhan;

import java.util.Scanner;

public class Print_all_positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("enter the values");
        for(int i=0;i<10;i++) {
            num[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(num[i]>0){
                System.out.print(num[i]+" ");
            }
        }
    }
}