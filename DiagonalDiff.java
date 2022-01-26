import java.util.*;
import java.lang.Math;
public class DiagonalDiff
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the szie:");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // System.out.println("enter elements:");
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
            
        }
        int d1=0,d2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    d1=d1+arr[i][j];
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-j-1){
                    d2=d2+arr[i][j];
                }
            }
        }
        int diff=d1-d2;
        diff=Math.abs(diff);
        System.out.println(diff);
	}
}
