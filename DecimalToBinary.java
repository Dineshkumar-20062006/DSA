import java.util.*;

public class DecimalToBinary
{   public static int dec_to_bin(int num)//12
{
    int pv=1,bin=0;
    while(num!=0)//12!=0  6!=0  3!=0  1!=0
    {
        int rem = num%2;//12%2=0  6%2=0  3%2=0 1%2=12
        bin = rem*pv+bin;//0*1+0=0  0*10+0=0  1*100+0=100  1*1000+100=1100
        pv=pv*10;//1--10 10--100 100--1000 1000--10000
        num=num/2;//12/2=6  6/2=3  3/2=1 1/2=0
    }
    return bin;
    
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(dec_to_bin(num));
	}
}
