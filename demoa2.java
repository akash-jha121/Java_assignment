import java.util.*;
class a2{
    public void swap(int c,int d){
     c=c+d;
     d=c-d;
     c=c-d; 
     System.out.println("after swapping value of c:"+c);
     System.out.println("after swapping value of d:"+d);
    } 

}
public class demoa2{
    public static void main(String[]args){
    int c,d;
    System.out.print("enter c:");
    Scanner sc=new Scanner(System.in);
    c=sc.nextInt();
    System.out.print("enter d:");
    d=sc.nextInt();
    a2 ob1=new a2();
    ob1.swap(c,d);
    }
}


