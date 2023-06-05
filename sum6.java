import java.util.Scanner;
class revsereString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
String gg="";
System.out.print("Enter a String:");
n =sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--){
gg=gg+n.charAt(i);

}
System.out.print(gg);
}

}