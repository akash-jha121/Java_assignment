import java.util.*;
class a1{
    public int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++ ){
            fact=fact*i;
        }
        return fact;
    }

    }
class demoa1{
    public static void main(String[]args){
        int n;
        System.out.print("enter number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a1 ob1=new a1();
        System.out.print(ob1.fact(n));

     System.out.println();
    }
    
}    
