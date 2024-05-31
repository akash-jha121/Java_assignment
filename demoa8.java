import java.lang.Math;
import java.util.*;
class a8 {
    public void quad_root(int a,int b,int c){
        double d=b*b-4*a*c;
        double x1=(-b+Math.sqrt(d))/(2*a);
        double x2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("roots are:"+x1+" and "+x2);
        if (d>0){
            System.out.println("roots are real and distinct");
        }
        else if(d==0){
            System.out.println("roots are real and equal");
        }
        else{
            System.out.println("roots are imaginary");

        }
    }   
}
class demoa8{
    public static void main(String[]args){
        int a,b,c;
        System.out.print("enter a:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("enter b:");
        b=sc.nextInt();
        System.out.print("enter c:");
        c=sc.nextInt();
        a8 ob1=new a8();
        ob1.quad_root(a,b,c);
        

        }
    }

