import java.util.*;
import java.util.Scanner;
public class Trianglevalid
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a,b,c,d,e,f;
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 d=a+b;
 e=b+c;
 f=c+a;
 if(d>c && e>a && f>b)
 {
   System.out.println("Valid triangle");
}
else
{
System.out.println("Invalid triangle");
}
}
}
