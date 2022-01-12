package irfan;
import java.util.Scanner;
public class MultiArray {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[][] arr =new int[4][5];
  for(int i=0;i<arr.length;i++) {
	  for(int j=0;j<arr[0].length;j++) {
		  System.out.println("enter number: ");
		  int value=sc.nextInt();
		  arr[i][j]=value;
	  }
	  System.out.println();
 }
  for(int i=0;i<arr.length;i++) {
	  for(int j=0;j<arr[0].length;j++) {
		  System.out.println(arr[i][j] +"  ");
	  }
	  System.out.println();
  }
	
	
	
	}

}
