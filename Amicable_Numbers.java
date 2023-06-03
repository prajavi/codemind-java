import java.util.Scanner;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,s=0,su=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=1;i<m;i++)
        {
            if(m%i==0)
            {
                s=s+i;
            }
        }
        for(int j=1;j<n;j++)
        {
            if(n%j==0)
            {
                su=su+j;
            }
        }
        if(s==n && su==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}