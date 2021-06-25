import java.util.*;

class Operator
{
void unaryOper(int a,int b)
{
System.out.println("Post Increment : "+(a++));
System.out.println("Pre Decrement : "+(--b));
}
void arithmeticOper(int a,int b)
{
System.out.println("Addition : "+(a+b));
System.out.println("Subtraction : "+(a-b));
System.out.println("Multiplication : "+(a*b));
System.out.println("Division : "+(a/b));
System.out.println("Modulo: "+(a%b));

}
void relationalOper(int a,int b)
{
System.out.println("Greater than : "+(a>b));
System.out.println("Lesser than : "+(a<b));
System.out.println("Greater than or Equal to : "+(a>=b));
System.out.println("Lesser than or Equal to : "+(a<=b));
System.out.println("Equal than : "+(a==b));
System.out.println("Not Equal than : "+(a!=b));
}
void logicalOperator(int a,int b)
{
System.out.println("&&"+((a>b)&&(a!=b)));
System.out.println("||"+((a>b)||(a!=b)));
}
void ternaryOperator(int a,int b)
{
System.out.println("ternary operator : "+((a>=b)?a:b));
}
void assignmentOper(int a,int b)
{
System.out.println((a+=b));
System.out.println((a-=b));
System.out.println((a*=b));
System.out.println((a/=b));
System.out.println((a%=b));
}
}
public class OperatorDemo
{
public static void main(String args[])
{
System.out.println("Enter the Value1 : ");
Scanner sc=new Scanner(System.in);
int val1=sc.nextInt();
System.out.println("Enter the Value2 : ");
int val2=sc.nextInt();
Operator oper=new Operator();
for(int i=1;i<=6;i++)
{
System.out.println("Enter the Operation : ");
int op=sc.nextInt();
switch(op)
{
case 1:oper.unaryOper(val1,val2);
       break;
case 2:oper.arithmeticOper(val1,val2);
       break;
case 3:oper.relationalOper(val1,val2);
       break;
case 4:oper.logicalOperator(val1,val2);
       break;
case 5:oper.ternaryOperator(val1,val2);
       break;
case 6:oper.assignmentOper(val1,val2);
       break;
default:System.out.println("Invalid Operation");
}
}
}
}