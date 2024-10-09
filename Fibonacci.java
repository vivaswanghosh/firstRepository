import java.util.*;
public class Fibonacci 
{int n[],m[],c;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs (>2)");
        c=sc.nextInt();
        n=new int[c];
        m=new int[c];
        System.out.println("Enter the numbers");
        for (int i=0;i<c;i++)
        {
            n[i]=sc.nextInt();
        }
    }
    public boolean check() 
    {int ch=0;
        m[0]=0;
        m[1]=1;
        for (int i=2;i<c;i++)
        {
            m[i]=m[i-1]+m[i-2];
        }
        if (n[0]==m[0])
        {
            for (int i=0;i<c;i++)
            {
                if(n[i]==m[i])
                ch=ch+1;
            }
            if (ch==c)
            return true;
            else
            return false;
        }
        for (;m[0]<n[0];)
        {
            int t=m[c-2]+m[c-1];
            for (int i=0;i<c-1;i++)
            {
                m[i]=m[i+1];
            }
            m[c-1]=t;
        }
        if (n[0]==m[0])
        {
            for (int i=0;i<c;i++)
            {
                if(n[i]==m[i])
                ch=ch+1;
            }
            if (ch==c)
            return true;
            else
            return false;
        }
        else
        return false;
    }
    public void output()
    {
        if (check())
        System.out.println("Numbers are in Fibonacci series");
        else
        System.out.println("Numbers are not in Fibonacci series");
    }
    public static void main(String args[])
    {
        Fibonacci ob=new Fibonacci();
        ob.input();
        ob.output();
    }
}
