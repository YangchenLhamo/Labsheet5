package Array;
// import java.util.Scanner;
import java.util.Arrays;

public class Q20_equalityOf2Array {
    static void checkEquality(int[] arr1, int[] arr2){
        int a =0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1.length==arr2.length && arr1[i]==arr2[j]){
                  a=1;
                   
                }
               else{
                   a=2;
                }
            }     
        } 
        if(a==1){
            System.out.println("The given two matrix are equivalent matrix.");}
        if(a==2){
            System.out.println("The given two matrix are not equivalent matrix.");}
    }
    
    public static void main(String[] args) {
        int arr1[]={2,3,4,5};
        int arr2[]={2,3,4,5};
        System.out.println("First array: "+Arrays.toString(arr1));
        System.out.println("Second array: "+Arrays.toString(arr2));
        checkEquality(arr1,arr2);

    }
    
}
