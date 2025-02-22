public class Main{
    public static void main(String[]args){
        
        System.out.println();
        System.out.println("Total Students: "+Student.count);
        Student s1=new Student("Adib",59);
        System.out.println("Total Students: "+Student.count);
        Student s2=new Student("Bhombola",21);
        System.out.println("Total Students: "+Student.count);
        System.out.println();

        s1.showDetails();
        System.out.println();
        s2.showDetails();
        System.out.println();

        Student.updateUni("DU");

        s1.showDetails();
        System.out.println();
        s2.showDetails();
        System.out.println();

        /*
                
        Total Students: 0
        Total Students: 1
        Total Students: 2

        Name: Adib
        ID: 59
        Name of University: BUET

        Name: Bhombola
        ID: 21
        Name of University: BUET

        Name: Adib
        ID: 59
        Name of University: DU

        Name: Bhombola
        ID: 21
        Name of University: DU
 
        */

    }
}