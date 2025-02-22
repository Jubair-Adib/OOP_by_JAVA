public class Practical_6{
    public static void main(String [] args){
        Student_6 s1= new Student_6 ("Sobji","23");
        Student_6 s2= new Student_6 ("Chotu","35");
        Student_6 s3= new Student_6 ("Abonti","21");

        Course_6 c1=new Course_6 ("CSE1101","FCC");
        Course_6 c2=new Course_6 ("CSE1102","DIS");
        Course_6 c3=new Course_6 ("CSE1103","EEE");
        Course_6 c4=new Course_6 ("CHEM1104");
        Course_6 c5=new Course_6 ("MATH1105");

        s1.addCourse(c4);
        s1.addCourse(c5);

        s2.addCourse(c1);
        s2.addCourse(c2);
        s2.addCourse(c3);

        s3.addCourse(c4);

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

        /* 
        Name: Sobji
        ID: 23
        Courses taken:
        [null, Course_6@65b54208, Course_6@1be6f5c3, null, null, null]
        1) CHEM1104 x
        2) MATH1105 x


        Name: Chotu
        ID: 35
        Courses taken:
        [null, Course_6@119d7047, Course_6@776ec8df, Course_6@4eec7777, null, null]
        1) CSE1101 FCC
        2) CSE1102 DIS
        3) CSE1103 EEE


        Name: Abonti
        ID: 21
        Courses taken:
        [null, Course_6@65b54208, null, null, null, null]
        1) CHEM1104 x
        */

    }
}