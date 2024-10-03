


 class A{
    int x=10;
    void show(){
        System.out.println("x value from class 1:"+x);
    }
   }
 class B extends A {
    int y= 15;
    void show1(){
        System.out.println("y value from class 1:"+y);
    }

 }           
 class C extends A {
    void show2()
    {
        System.out.println("hello");
    }
    
        
    }

    
    
    


public class main
{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
         obj.show2();
}
    
}

 
 
