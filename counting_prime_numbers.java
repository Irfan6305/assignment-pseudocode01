package irfan_khan;

public class Counting_prime_numbers {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,13};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int count_division=0;
            for(int j=1;j<a+1;j++){
                if(a%j==0){
                    count_division+=1;
                }
            }
            if(count_division==2){
                count+=1;
            }
        }
        System.out.println(count);
    }
}