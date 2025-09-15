import java.util.*;

public class adamNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int sqr1=input*input;
		int sum=0,sum1=0;
		while(input!=0){
		    int rem = input%10;
		    sum=sum*10+rem;
		    input=input/10;
		    
		}
		int sqr2=sum*sum;
		while(sqr2!=0){
		    int rem2 = sqr2%10;
		    sum1=sum1*10+rem2;
		    sqr2=sqr2/10;
		}
		if(sqr1==sum1){
		    System.out.print("adam");
		}
		else{
		    System.out.print("not adam");
		}
	    
	}
}
/* i/p : 12 
  o/p : adam
  steps:
  1. 12*12=144
  2. 12----21
  3. 21*21=441
  4. 441----144
  step1==step4 print(adam)
  */
