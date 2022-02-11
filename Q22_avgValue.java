package Array;
import java.util.Arrays;
public class Q22_avgValue {
    static int[] sortArray(int[] aar){
        for(int i=0; i<aar.length; i++){
            for(int j=i+1; j<aar.length; j++){
                int temp=0;
                if(aar[i]>aar[j]){
                    temp=aar[i];
                    aar[i]=aar[j];
                    aar[j]=temp;
                }
            }
        }
        return aar;
    }
    static double getAverage(int[] aar){
        int avg=0, count=0;
        int [] finalArray=sortArray(aar);
        for(int i=0; i<finalArray.length-1; i++){
            if(finalArray[i]!= finalArray[0] && finalArray[i]!=finalArray[finalArray.length-1] ){
                avg += finalArray[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(finalArray));
        return ((double)avg/count);

    }
    

    public static void main(String[] args) {
        int aar[]={1,2,5,3,6,3,8,7,9};
        System.out.println("Arrys: " +Arrays.toString(aar));
        int [] value=sortArray(aar);
        System.out.println("The sorted arry is:" +Arrays.toString(value));

    }
    
}
