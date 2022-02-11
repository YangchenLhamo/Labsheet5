package Array;
// import java.util.Arrays;
import java.util.Scanner;
public class Q23_checkO_1 {
 
    static void checkElement(int[][] aar, int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(aar[i][j]==0){
                    System.out.println("The given matrix contain 0 in "+"matrix["+(i+1)+"]["+(j+1)+"]");
                }
                if(aar[i][j]==-1){
                    System.out.println("The given matrix contain -1 in "+"matrix["+(i+1)+"]["+(j+1)+"]"); 
                }               
            }
        }
       
    }
    public static void main(String[] args) {
        int i, j;
        Scanner cc=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int n=cc.nextInt();
        System.out.println("Enter the number of column: ");
        int m=cc.nextInt();
        int aar[][]= new int[n][m];
        System.out.println("Enter the element of matric:");
        for(i=0; i<n; i++){
            for( j=0; j<m; j++){
                aar[i][j]=cc.nextInt();
            }
        }
        System.out.println("The given matrics is:");
        for( i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.print(aar[i][j] +" ");
            }
            System.out.println();
        }
        checkElement(aar,n, m);
        cc.close();
       
    }

    
}
