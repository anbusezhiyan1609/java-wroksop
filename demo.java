class employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    
        if (age<18){
            this.age = age;
        }
       
        

    }
   
}
public class demo{
    public static void main(String[] args) {
        employee obj = new employee();
        obj.setName("anbu");
        obj.setAge(20);
        System.out.println("my name is"+ obj.getName());
        System.out.println("my age is"+ obj.getAge());
        
        
        
    }
}

