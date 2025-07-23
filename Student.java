package oops;
import java.util.*;
public class Student {
public static void main(String args[]) {
	String Name, Rollno;
    System.out.print("Enter Name: ");
    Scanner sll=new Scanner(System.in);
    Name=sll.nextLine();
    System.out.print("Enter Roll No.: ");
    Rollno=sll.nextLine();
    System.out.println("Student details are: ");
    System.out.println("Name: "+Name);
    System.out.println("Roll No.: "+Rollno);
}
}
