import java.util.*;
public class position{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        int pov1 = (int)Math.pow(10,pos1-1);
        int pov2 = (int)Math.pow(10,pos2-1);
        int d1 = (n/pov1)%10;
        int d2 = (n/pov2)%10;
        n =(n-(d1*pov1))+(d2*pov1);
        n =(n-(d2*pov2))+(d1*pov2);
        System.out.println(n);
    }
}