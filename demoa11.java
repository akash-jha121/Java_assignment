class c2 {   //method overloading
    public void add(int a,int b){
        System.out.println((a+b));
    }
    public void add(int a1,int b1,int c1){
        System.out.println((a1+b1+c1));
    }    
    public void add(double d1 ,double d2){
        System.out.println((d1+d2));
    }    
    
}
class demoa11{
    public static void main(String[]args){
     c2 obj=new c2();
     obj.add(5,6);
     obj.add(4,9,8);
     obj.add(4.9,5.7);

}
}

    

