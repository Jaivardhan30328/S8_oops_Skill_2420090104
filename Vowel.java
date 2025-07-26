package oops;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vow=new Scanner(System.in);
	    System.out.print("Enter an alphabet:");
	    char a=vow.next().charAt(0);
	    if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
	    {
	      System.out.print("It is a vowel");
	    }
	    else
	    {
	      System.out.print("It is not a vowel");
	    }
	}

}
