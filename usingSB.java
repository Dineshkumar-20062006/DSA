import java.util.*;

public class usingSB
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder newstr = new StringBuilder();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		        newstr.append('*');
		    }
		    else{
		        newstr.append(ch);
		    }
		}
		System.out.print(newstr.toString());
		
	}
}// using StringBuilder
//i:p ;welcome party
//op: w*lc*m* p*rty
