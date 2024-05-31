import java.util.*;
class a6 {
    public void prime_num(int n){
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.println(i);
            }
        }
    } 
}
class demoa6{
    public static void main(String[]args){
        int n;
        System.out.print("enter given prime number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a6 ob1=new a6();
         ob1.prime_num(n);

    }
}
