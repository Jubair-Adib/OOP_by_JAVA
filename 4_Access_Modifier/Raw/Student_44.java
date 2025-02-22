//if we use "package Raw;", then we have to compile from outside the folder.

package Raw;
public class Student_44{
    public String name;
    String id;
    private int age;
    protected double cgpa;
    public Student_44(){

    }
    public Student_44(String name, String id){
        this.name=name;
        this.id=id;
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
    }
}