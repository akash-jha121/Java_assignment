class a4 {
    public static void main(String[]args){
        int x=0;
        int y=1;
        int z;
        System.out.println("first 10 numbers in fibonacci series:");
        System.out.print(x+" "+y+" ");
        int s=0;
        for(int i=3;i<=10;i++){
            z=x+y;
            x=y;
            y=z;
            System.out.print(z+" ");
            s=s+z;
        }
        System.out.println();
        System.out.println("sum is:"+(s+1));
        
    }
    
}
