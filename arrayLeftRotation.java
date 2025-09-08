import java.util.*;

public class arrayLeftRotation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int temp;
		int rot= sc.nextInt();
		for(int left=1;left<=rot;left++){
		    temp=arr[0];
		    for(int ind=0;ind<n-1;ind++){
		        arr[ind]=arr[ind+1];
		        arr[n-1]=temp;
		    }
		    
		}
		for(int j=0;j<n;j++){
		    System.out.print(arr[j]+" ");
		}
	}
}
