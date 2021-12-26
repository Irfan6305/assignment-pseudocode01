package irfan_khan;

import java.util.Scanner;

public class Average_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        float sum=0;
        for(int j=0;j<size;j++){
            sum+=arr[j];
        }
        double Average=sum/size;
        System.out.println(Average);
    }
}