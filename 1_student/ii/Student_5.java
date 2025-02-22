public class Student_5{
    public String name;
    public String id;

    //Parameterized constructor called
    /*
    public Student_5(String name,int id){
        System.out.println("Contructor is called");
        // difference between local and instance variable
        name=name;
        id=id;
    }
    */
    public Student_5(String name,String id){
        System.out.println("Contructor is called");
        this.name=name;
        this.id=id;
    }
    // Constructor overloading
    public Student_5(){
        System.out.println("Contructor is called without parameter");
        //this.name=null;
        //this.id=null;
    }

    //PaSS BY REFFERENCE
    public void Pass_by_ref(Student_5 obj){
        System.out.println("I am "+name);
        System.out.println("Hello "+obj.name);
        System.out.println("Pass by Reff is done here.");
    }
    public void showDetail(){
        System.out.println(name+" "+id);
    }
}