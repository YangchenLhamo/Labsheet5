package Array;
import java.util.Arrays;
public class Q31_sortMaxMin {
    static int[] sortArrays(int [] array){
        int len=array.length;
        for(int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                int temp1=0;
                if(array[i]>array[j]){
                    temp1=array[i];
                    array[i]=array[j];
                    array[j]=temp1;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
        

    }

    static void minMaxElement(int [] array){
        int lastIndex=array.length-1;
        int firstIndex=0;
        int temp[]= new int[array.length];
        for(int i=0; i<array.length-1; i++){
            if(i%2!=0){
                temp[i]=array[lastIndex];
                lastIndex--;
            }else{
                temp[i]=array[firstIndex];
                firstIndex++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        int num[]={7,3,6,4,2,1,5,8,9};
        System.out.println(Arrays.toString(num));
        System.out.println();
        System.out.println("--------------sorted matrix----------------");
        sortArrays(num);
        System.out.println();
        System.out.println("------------MinMax sorted element---------------");
        minMaxElement(num);
    }
    
}
