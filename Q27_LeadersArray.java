package Array;
import java.util.Arrays;
public class Q27_LeadersArray {

    static void checkLeaderElement(int[] array){
        for(int i=0; i<array.length; i++){
            boolean greater= false;
            for(int j=i; j<array.length-1; j++){
                if(array[i]>array[j+1]){
                    greater = true;
                }else{
                    greater = false;
                    break;
                }
            }
            if(greater)
                System.out.println(array[i] +" is leader element.");
        }
       
    }
    public static void main(String[] args) {
        int aar[]= {1,2,6,15,7,9,11,5,8};
        System.out.println(Arrays.toString(aar));
        checkLeaderElement(aar);
    }
    
}
