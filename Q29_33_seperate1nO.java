package Array;
import java.util.Arrays;
public class Q29_33_seperate1nO {
    static int[] seggregatElement(int [] aar){
        int length=aar.length;
        int [] temp= new int[length];
        // for the palcementof 0(start from zero index)
        int firstindex=0;
        // for the placement of 1(start from last index)
        int lastindex=length -1;
        for (int i:aar){
            if(i==0){
                temp[firstindex]=i;
                firstindex++;
            }
            else{
                temp[lastindex]=i;
                lastindex--;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int aar[]= {1,0,0,0,1};
        int [] aa = seggregatElement(aar);
        System.out.println(Arrays.toString(aa));


    }
    
}
