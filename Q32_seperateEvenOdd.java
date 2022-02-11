package Array;
import java.util.Arrays;
public class Q32_seperateEvenOdd {

    static int[] sortElement(int[] array){
        int len=array.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                int temp=0;
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]= array[j];
                    array[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    static int[] oddEvenPlacement(int[] array){
        int len=array.length;
        int[] temp=new int[len];
        int lastIndex=len-1;
        int firstIndex=0;
        for(int i=0; i<len; i++){
            if(array[i]%2!=0){
                temp[firstIndex]=i;
                firstIndex++;
            }else{
                temp[lastIndex]=i;
                lastIndex--;
            }
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }
    
    public static void main(String[] args) {
        int num[]={1,9,6,5,3,2,7,4,8};
        System.out.println(Arrays.toString(num));
        System.out.println("-------------in Sorted Form-----------------");
        sortElement(num);
        System.out.println("----------------Odd Even Placement-----------------");
        oddEvenPlacement(num);
    }
}
