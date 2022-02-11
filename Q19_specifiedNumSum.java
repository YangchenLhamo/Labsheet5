package Array;
import java.util.Arrays;
import java.util.Scanner;
 public class Q19_specifiedNumSum{
     static void pairElement(int[] arr, int num){
         for(int i=0; i<arr.length; i++){
             for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==num){
                     System.out.println(arr[i]+" + "+arr[j]+" = "+ num);
                }
            }
        }

    }
 
    public static void main(String[] args) {
        Scanner nn=new Scanner(System.in);
        int arr[]={1,3,6,8,0,5};
        System.out.println("Array= "+Arrays.toString(arr));
        System.out.println("Enter the number that you want as a sum of elements of array.");
        int num=nn.nextInt();
        pairElement(arr,num);
        nn.close();
    }
}