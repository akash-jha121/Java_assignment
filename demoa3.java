import java.util.*;
class a3{
    public void big_num(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("biggest number is:"+a);
        }
        else if(b>a && b>c){
            System.out.println("biggest number is:"+b);
        }
        else{
            System.out.println("biggest number is:"+c);
        }
    }  
}
class demoa3{
    public static void main(String[]args){
        int a,b,c;
        System.out.print("enter first number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("enter second number:");
        b=sc.nextInt();
        System.out.print("enter third number:");
        c=sc.nextInt();
        a3 ob1=new a3();
        ob1.big_num(a, b, c);
    }
}

