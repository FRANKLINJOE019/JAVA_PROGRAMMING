import java.util.Scanner;
public class readinteger {
public static void main (String[] args){
System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int value = input.nextInt();
if (value % 2  == 0 )
System.out.println(value + " is even");
if (value % 2 != 0)
System.out.println(value + " is odd");
}}
