/*
    public class Student_1{
        public String name;
        public String id;
        publ ic void m1(int n){
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
*/

public class Practical_1{
    public static void main(String [] args){
        
        System.out.println();
        
        //0
        int [] arr= new int [5];
        System.out.println(arr);
        //[I@372f7a8d
        System.out.println();
 
        //1
        Student_1 s1= new Student_1();
        System.out.println(s1);
        //Student@372f7a8d
        System.out.println(s1.name);
        System.out.println(s1.id);
        //null
        //null
        System.out.println();

        //2
        Student_1 s2= new Student_1();
        s2.name="Adib";
        s2.id="SH-59";
        System.out.println(s2.name);
        System.out.println(s2.id);
        //Adib
        //SH-59
        System.out.println();

        //3
        Student_1 s3= new Student_1();
        s3.name="Edy";
        s3.id="29";
        s2=s3;
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s3.name);
        System.out.println(s3.id);
        //Edy
        //29
        //Edy
        //29
        System.out.println();
        
        //4
        //Instance Method
        /* 
        m1();
        will not work,
        if I call a method, then we've to call that with respect to the object
        */
        Student_1 s4= new Student_1();
        s4.name="Bhombola";
        s4.id="37";
        System.out.println(s4.name);
        System.out.println(s4.id);
        s4.m1(1);
        System.out.println();

        //5
        Student_1 s5= new Student_1();
        s5.showDetail();
        System.out.println(s5);
        s5=new Student_1();
        s5.showDetail();
        System.out.println(s5);
        System.out.println();
        
    }
}