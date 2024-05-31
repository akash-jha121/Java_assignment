import java.util.*;
class a5 {
    public int fact(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
        return n* fact(n-1);
    } 
    }
}    
class demoa5{
    public static void main(String[]args)
{
    int n;
    System.out.print("enter n:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a5 ob1=new a5();
    System.out.println("factorial value is:"+ob1.fact(n));
}
}



