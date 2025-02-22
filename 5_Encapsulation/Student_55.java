// Encapsulation

public class Student_55{
    public String name;
    private int id;
    private double cg ;
    public Student_55(){

    }
    public Student_55(String name, int id){
        this.name=name;
        this.id=id;
    }

    public Student_55(String name, int id, double cg){
        this.name=name;
        this.id=id;
        this.cg=cg;
    }
    //s1.id=43;
    //it will not work,because of private.

    // thats why designer design the method, 
    //but user can't watch how it works


    //setter method
    public void setID(int id){
        if(id>0) this.id=id;
        else System.out.println("Invalid ID given");
    }

    //getter method
    public int getID(){
        return id;
    }

    // private method get access with the help of public method 
    private void result(){
        if(cg>=2) System.out.println("Passed");
        else System.out.println("Failed");
    }

    public void showDetails(){
        result();
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cg);
    }
}