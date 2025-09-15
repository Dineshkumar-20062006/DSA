import java.util.*;

public class ConstructionMethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int pv = 1;
		while(num/pv!=0){
		    pv=pv*10;
		}
		pv=pv/10;
		while(pv!=0){
		    int dig=(num/pv)%10;
		    System.out.print(dig+" ");
		    pv=pv/10;
		}
	}
}

// i/p: 342
// o/p: 3 4 2 
