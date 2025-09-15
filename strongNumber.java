import java.util.*;
public class strongNumber
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0){
		    int fact=1;
		    int rem = num%10;
		    if(rem>0){
		        for(int i=1;i<=rem;i++){
		            
		            fact=fact*i;
		        }
		    }
		    sum = sum+fact;
		    num=num/10;
		}
		if(sum==temp){
		    System.out.print("strong");
		}
		else{
		    System.out.print("not strong");
		}
	}
}
/* input = 145
each digit have to take factorial
  5!=120  4!==24  1!=1
  ans = 120+24+1=154
  input == ans(Strong)
  */
