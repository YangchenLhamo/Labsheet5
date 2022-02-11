package Array;
import java.util.Arrays;
public class Q25_printLength {

    static int removeDuplicates(int arr[], int n)
{
    if (n==0 || n==1)
        return n;
 
    // To store index of next unique element
    int j = 0;
 
    // Doing same as done in Method 1
    // Just maintaining another updated index i.e. j
    for (int i=0; i < n-1; i++)
        if (arr[i] != arr[i+1])
            arr[j++] = arr[i];
 
    arr[j++] = arr[n-1];
 
    return j;
}
       
    public static void main(String[] args) {
        int[] aar={10,20,30,30,40,40,50,10};
        System.out.println(Arrays.toString(aar));
        removeDuplicates(aar, 0);
    }
    
}
