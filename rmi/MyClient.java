import java.rmi.*; 
import java.util.Scanner;
public class MyClient{  
public static void main(String args[]){  
try{
int num1, num2;
Scanner input = new Scanner(System.in);

System.out.print("Enter the first number: ");
num1 = input.nextInt();

System.out.print("Enter the second number: ");
num2 = input.nextInt();
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");  
System.out.println(stub.add(num1, num2));  
}catch(Exception e){}  
}  
}  