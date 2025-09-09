import java.util.*;

public class stringLeftRotation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		int rot =sc.nextInt();
		int size=str.length();
		char[] charray = new char[size];
		charray=str.toCharArray();
		for(int left=1;left<=rot;left++){
		    char temp=charray[0];
		    for(int i=0;i<size-1;i++){
		        charray[i]=charray[i+1];
		    }
		    charray[size-1]=temp;
		}
		System.out.print(String.valueOf(charray));
	}
}
/* left String rotation
rot = 1
ip:cat
op:atc
*/
