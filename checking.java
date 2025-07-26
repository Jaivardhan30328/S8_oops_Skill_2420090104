package oops;
import java.util.*;
public class checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner alph=new Scanner(System.in);
		System.out.print("Enter an alphabet:");
		char a=alph.next().charAt(0);
		if(a>='A'&& a<='Z'||a>='a'&& a<='z')
		{
		  System.out.print("It is an alphabet");
		}
		else
		{
		  System.out.print("It is not an alphabet");
		}
	}

}
