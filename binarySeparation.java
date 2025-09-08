import java.util.*;

public class binarySeparation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num!=0){
		    int copy = num;
		    int pv=1,ans=0,rem;
		    while(copy!=0){
		        rem = copy%10;
		        if(rem!=0){
		            ans=1*pv+ans;
		        }
		        pv=pv*10;
		        copy=copy/10;
		    }
		    System.out.print(ans+" ");
		    num=num-ans;
		}
	
	}
}
/* 31
3 1 = 1 1   31-11=20
2 0 = 1 0   20-10=10
1 0 = 1 0   10-10=0
it will compare using true or false if their is number it will 1 else 0 */
