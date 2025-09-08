import java.util.*;

public class binaryArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int[] narr = new int[8];
		for(int i=0;i<8;i++){
		    arr[i] = sc.nextInt();
		}
		int day = sc.nextInt();
		for(int itr=1;itr<=day;itr++){
		    narr[0]=arr[1];
		    narr[7]=arr[6];
		    for(int ind=1;ind<7;ind++){
		        narr[ind]=arr[ind-1]^arr[ind+1];
		    }
		    for(int in=0;in<8;in++){
		        arr[in]=narr[in];
		    }
		}
		for(int indx=0;indx<8;indx++){
		    System.out.print(arr[indx]+" ");
		}
	}
}
