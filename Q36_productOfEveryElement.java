package Array;
import java.util.Arrays;
public class Q36_productOfEveryElement {

    static void getProduct(int[] array){
        int len=array.length;
        int temp[] = new int [len];
        for(int i=0; i<len; i++){
            int sum=1;
            for(int j=0; j<len; j++){
                if(i!=j){
                    sum=sum*array[j];
                }
            }
            temp[i]=sum;
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        int num1[]={1,3,5,7,8,9};
        int num2[]={0,1,3,5,7,8,9};
        System.out.println("First array:"+Arrays.toString(num1));
        getProduct(num1);
        System.out.println("--------------------------------------------------------");
        System.out.println("Second Array:"+Arrays.toString(num2));
        getProduct(num2);
    }
    
}
