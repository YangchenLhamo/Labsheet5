package Array;
import java.util.Arrays;
public class Q30_cyclicRotate {
    static void clockwiseRotation(int [] aar){
        int templastval=aar[aar.length-1];
        for(int i=aar.length-1; i>0; i--){
            aar[i]=aar[i-1];
        }
        aar[0]=templastval;
        System.out.println(Arrays.toString(aar));

    }

    static void anticlockwiseRotation(int [] aar){
        int len=aar.length;
        int first=aar[0];
        for(int i=0; i<len-1; i++){
            aar[i]=aar[i+1];
        }
        aar[len-1]=first;
        System.out.println(Arrays.toString(aar));

    }

    public static void main(String[] args) {
        int aar[]={1,2,3,4,5,6};
        clockwiseRotation(aar);
        anticlockwiseRotation(aar);
    }
}
