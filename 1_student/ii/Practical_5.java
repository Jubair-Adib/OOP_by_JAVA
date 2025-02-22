public class Practical_5{
    public static void main(String [] args){
        
        System.out.println();
        // Constructor 
        Student_5 s1= new Student_5("Adib","59");
        s1.showDetail();
        System.out.println(s1);
        System.out.println();

        Student_5 s2= new Student_5("Edy","29");
        s2.showDetail();
        System.out.println(s2);
        System.out.println();

        // Constructor overloading
        Student_5 s3= new Student_5();
        s3.showDetail();
        System.out.println(s3); 
        System.out.println();

        // Pass by refference 
        s1.Pass_by_ref(s2);  
        System.out.println();

        System.out.println(s2);
        s2= new Student_5("Edy","29");
        s2.showDetail();
        System.out.println(s2);
        System.out.println();

    }
}   

/*
 public class Student_5{
    public String name;
    public String id;

    //Parameterized constructor called
    
    //public Student_5(String name,int id){
    //    System.out.println("Contructor is called");
    //    difference between local and instance variable
    //    name=name;
    //    id=id;
    //}
    
    public Student_5(String name,String id){
        System.out.println("Contructor is called");
        this.name=name;
        this.id=id;
    }
    // Constructor overloading
    public Student_5(){
        System.out.println("Contructor is called without parameter");
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
*/