public class Student_1{
    public String name;
    public String id;
    public void m1(int n){
        int m=123456789;
        System.out.println(m);
        System.out.println("Instance method is working here");
    }
    //constructor called
    public Student_1(){
        System.out.println("Contructor is called");
    }
    public void showDetail(){
        System.out.println(name+" "+id);
    }
}