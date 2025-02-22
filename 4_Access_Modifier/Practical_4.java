/* 
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
*/

import Raw.*;

public class Practical_4{
    public static void main(String[]args){
        
        System.out.println();
        Student_44 s1=new Student_44();
        s1.showDetails();
        //System.out.println("Name: "+s1.name);
        //System.out.println("ID: "+s1.id);
        //System.out.println("Age: "+s1.age);
        //System.out.println("CGPA: "+s1.cgpa);
        System.out.println();

        Student_44 s2=new Student_44("Abonti","21");
        s2.showDetails();
        //System.out.println("Name: "+s2.name);
        //System.out.println("ID: "+s2.id);
        //System.out.println("Age: "+s2.age);
        //System.out.println("CGPA: "+s2.cgpa);
        System.out.println();

        /*
        Name: null
        ID: null
        Age: 0
        CGPA: 0.0

        Name: Abonti
        ID: 21
        Age: 0
        CGPA: 0.0
        */
    }
}