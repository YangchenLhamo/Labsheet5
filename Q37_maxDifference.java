package Array;
import java.util.Arrays;
public class Q37_maxDifference {
    static int getmaxDifference(int [] num){
        int maxdiff=0;
        for(int i=0; i<num.length; i++){
            for (int j=0; j<num.length; j++){
                if(num[j]-num[i]>maxdiff){
                    maxdiff=num[j]-num[i];
                }
            }
        }
        return maxdiff;
    }
    public static void main(String[] args) {
        int num[]={2,3,5,1,7,8,4};
        System.out.println(Arrays.toString(num));
        int maxDifference=getmaxDifference(num);
        System.out.println("The maximum difference of the given element of the array is:"+maxDifference);
    }
    
}
