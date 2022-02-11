package Array;
import java.util.Arrays;
import java.util.Random;
public class Q35_shuffleElement {
    static void shuffling(int[] array){
        Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int index = rand.nextInt(array.length);
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
      

    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        System.out.println("Before shuffling: "+Arrays.toString(num));
        System.out.println("------------------------------------------------------------------");
        System.out.println("After shuffling:");
         shuffling(num);
    }
    
}
