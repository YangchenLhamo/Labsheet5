package Array;
import java.util.Arrays;
public class Q21_evenOdd {
    static void checkEvenOdd(int []arr){
        int evencount=0, oddcount=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]+" is even number.");
                evencount++;
            }
            else{
                System.out.println(arr[i]+" is odd number.");
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,5,7,8,9,5};
        System.out.println("Array:"+Arrays.toString(arr));
        checkEvenOdd(arr);
    }

}
