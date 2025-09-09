import java.util.*;

public class vowelsinString
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		        System.out.print("* ");
		    }
		    else{
		        System.out.print(ch);
		    }
		} 
		
	}
}
//display the * instead of volwels
//ip:welcome
//op:w*lc*m*
