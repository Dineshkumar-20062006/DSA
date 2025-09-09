import java.util.*;

public class rightStringRotation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		int rot =sc.nextInt();
		int size=str.length();
		char[] charray = new char[size];
		charray=str.toCharArray();
		for(int right=1;right<=rot;right++){
		    char temp=charray[size-1];
		    for(int i=size-1;i>0;i--){
		        charray[i]=charray[i-1];
		    }
		    charray[0]=temp;
		}
		System.out.print(String.valueOf(charray));
	}
}
/* left String rotation
rot = 1
ip:cat
op:atc
*/
