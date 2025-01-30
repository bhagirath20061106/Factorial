package bhagirath;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<=n;i++) {
			s*=i;
		}
		System.out.print("Factorial of the number "+n+" is :"+s);

	}

}
