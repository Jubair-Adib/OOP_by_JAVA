public class Practical_55{
    public static void main(String[]args){
        
        System.out.println();
        Student_55 s1=new Student_55();
        s1.showDetails();
        
        //s1.id=43;
        //it will not work,because of private.
        
        //System.out.println("Name: "+s1.name);
        //System.out.println("ID: "+s1.id);
        s1.setID(20);
        s1.getID();
        s1.showDetails();
        System.out.println();

        Student_55 s2=new Student_55("Adib",1);
        s2.showDetails();
        //System.out.println("Name: "+s2.name);
        //System.out.println("ID: "+s2.id);
        s2.setID(59);
        s2.getID();
        s2.showDetails();
        System.out.println();

        Student_55 s3=new Student_55("Abonti",37,3.911);
        s3.showDetails();
        //System.out.println("Name: "+s2.name);
        //System.out.println("ID: "+s2.id);
        s3.setID(21);
        s3.getID();
        s3.showDetails();
        System.out.println();

        /*
        Failed
        Name: null
        ID: 0
        CGPA: 0.0
        Failed
        Name: null
        ID: 20
        CGPA: 0.0

        Failed
        Name: Adib
        ID: 1
        CGPA: 0.0
        Failed
        Name: Adib
        ID: 59
        CGPA: 0.0

        Passed
        Name: Abonti
        ID: 37
        CGPA: 3.911
        Passed
        Name: Abonti
        ID: 21
        CGPA: 3.911 
        */

    }
}