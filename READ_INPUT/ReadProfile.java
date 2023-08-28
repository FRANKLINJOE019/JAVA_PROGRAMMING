import java.util.Scanner;
public class ReadProfile{
	public static void main(String[] args){
System.out.println("Enter your name");
Scanner input = new Scanner(System.in);
String Name = input.next();
System.out.println("Enter your age");
int Age = input.nextInt();
System.out.println("my name is " + Name + " and i am " + Age + " years old");
	}
}
