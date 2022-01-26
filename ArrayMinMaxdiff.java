import java.util.*;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the elements:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));
        int m=0;
        int n=0;
        
        for(int i=0;i<4;i++){
            m+=arr[i];
        }
        for(int i=1;i<5;i++){
            n+=arr[i];
        }
        
        System.out.println(m+"  "+n);
        
	}
}
