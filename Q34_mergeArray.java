package Array;

import java.util.Arrays;
public class Q34_mergeArray {

    static int[] sortElement(int [] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                int temp=0;
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }System.out.println(Arrays.toString(array));
        return array;
    }

    static void mergeArrays(int [] Num1, int[] Num2){
        int[] mergedNum=new int[Num1.length + Num2.length];
        for(int i=0; i<mergedNum.length; i++){
            if (i<Num1.length){
                mergedNum[i]=Num1[i];
            }else{
                mergedNum[i]=Num2[i % Num2.length];
            }
        }
        System.out.println("After merging=="+Arrays.toString(mergedNum));
        sortElement(mergedNum);

        //assigning to inserted arrays
        for(int i=0; i<mergedNum.length; i++){
            if(i<Num1.length){
                Num1[i]=mergedNum[i];
            }else{
                Num2[i % Num2.length]=mergedNum[i];
            }
        }
    }
    public static void main(String[] args) {
        int Num1[]={5,1,4,3,10,8};
        int Num2[]={2,7,6,9};
        System.out.println("---------------------First Matrix:-------------------------");
        System.out.println(Arrays.toString(Num1));
        System.out.println("--------------------Second matrix:------------------");
        System.out.println(Arrays.toString(Num2));

        mergeArrays(Num1, Num2);

        System.out.println("After merging:");
        System.out.println("---------------------First Matrix:-------------------------");
        System.out.println(Arrays.toString(Num1));
        System.out.println("--------------------Second matrix:------------------");
        System.out.println(Arrays.toString(Num2));
    }
    
}
