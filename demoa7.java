import java.util.*;
class a23 {
     public double cal_num(int n){
        double s=0;
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            s=s+1.0/f;
        }
        return s;
        
     }  
}
class demoa7{
    public static void main(String[]args){
        int n;
        System.out.print("enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a23 ob1=new a23();
        System.out.println("sum is:"+ob1.cal_num(n));

    }
}
