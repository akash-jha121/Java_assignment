import java.util.*;
class a12 {
    public void session(int n){
        switch(n){
            case 1:
            case 2:
            System.out.println("month"+" "+n+" "+"is:"+"winter");
            break;
            case 3:
            case 4:
            System.out.println("month"+" "+n+" "+"is:"+"spring");
            break;
            case 5:
            case 6:
            System.out.println("month"+" "+n+" "+"is:"+"summer");
            break;
            case 7:
            case 8:
            System.out.println("month"+" "+n+" "+"is:"+"monsoon");
            break;
            case 9:
            case 10:
            System.out.println("month"+" "+n+" "+"is:"+"autumn");
            break;
            case 11:
            case 12:
            System.out.println("month"+" "+n+" "+"is:"+"pre-winter");
            break;
        }
    }
        
    }
class demoA9{
    public static void main(String[]args){
        int n;
        System.out.print("enter month number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a12 ob1=new a12();
        ob1.session(n);


    }
}    
    
