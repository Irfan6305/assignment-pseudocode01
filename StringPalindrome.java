package irfan_khan;
import java.util.Scanner;
import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the string to convert to ch array and to the palindrome");
		System.out.println("with assuming lowwer and upper case");
		String a = sc.nextLine();
		char arr[] = a.toCharArray();
		System.out.println(Arrays.toString(arr));
		boolean flag =true;
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			if(arr[i] !=arr[j]) {
				flag=false;
				break;
			}
		}
		System.out.println("answer for this array is"+flag);
	}

}
