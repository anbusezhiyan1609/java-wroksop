/*class calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;

    }
}
public class anbu {
    public static void main(String[] args) {
        System.out.println("calculator program");
        calculator obj = new calculator();
        System.out.println(obj.add(5,6));

        System.out.println(obj.add(4,5,6));
    }
}
*/

/* 
class parent{
    void display(){
        System.out.println("i am parent");
    }
    
}
class child{
    void display(){
        System.out.println("i am child");
    }
}
public class anbu{
    public static void main(String[] args) {
        parent obj = new parent();
        child obj1 = new child();
        obj.display();
        obj1.display();
    }
}
*/

/*interface parent{
      void display();
}

class child implements parent{
    public 
    void display(){
        System.out.println("I am child");
    }

}
public class anbu{
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}
    */
/* 
interface parent {
    void display1();
        
}
interface child extends parent{
    void display2();
    
}
class A implements child, parent{
    public void display1(){
        System.out.println("I am parent");
        
    }
    public void display2(){
        System.out.println("I am child");
    }
}
public class anbu{
    public static void main(String[] args) {
       A obj = new A();
       obj.display1();
        obj.display2();
            
        
    }
}
    */

class parent{
    void display(){
        System.out.println("I am parent");
    }
}
class child extends parent{

    child() {
    }
    void display(){
        System.out.println("I am child");

    }
}
public class anbu{
    public static void main(String[] args) {
        parent obj = new child();
        obj.display();
    }
}
