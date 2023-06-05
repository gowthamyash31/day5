import java.util.Scanner;
class powe1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int base;
int power;
int result =1;
System.out.print("Enter the base number ");
base =sc.nextInt();
System.out.print("Emter the power");
power =sc.nextInt();
for(int i=1; i<=power;i++)
{
result *=base;}
System.out.println("result:"+ result);
}

}