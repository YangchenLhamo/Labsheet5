package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Q26_sumofTwoElement {
    static void sumOfElement(int [] array, int num){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]+array[j]==num){
                    System.out.println(array[i]+"+"+ array[j]+" = "+ num);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] aar={1,2,3,4,5,6};
        System.out.println(Arrays.toString(aar));
        Scanner nn=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=nn.nextInt();
        nn.close();
        sumOfElement(aar, num);

    }
    
}
