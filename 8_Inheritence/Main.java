public class Main{
    public static void main(String[]args){
        
        System.out.println();
        CSEStudent s1=new CSEStudent("Adib",59,3.65);
        s1.doClass();
        System.out.println();
        s1.doLabClass();
        System.out.println();
        s1.showDetails();
        System.out.println();

        Student s2=new Student();
        s2.doClass();
        System.out.println();
        s2.showDetails();
        System.out.println();

        Student s3=new Student("Laddu",37);
        s3.doClass();
        System.out.println();
        s3.showDetails();
        System.out.println();
        /*
                
        Adib is doing theory class.

        Adib is doing LAB class.

        Name: Adib
        ID: 59
 
        */
 
    }
}