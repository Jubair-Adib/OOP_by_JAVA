import java.util.Arrays;
public class Student_6{
    public String name;
    public String id;
    public Course_6 [] courses = new Course_6 [6];
    public int course_count=1;

    public Student_6(String name, String id){
        this.name=name;
        this.id=id;
    }
    public void addCourse(Course_6 c){
        courses[course_count]=c;
        course_count++;
    }

    public void showDetails(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Courses taken:");
        System.out.println(Arrays.toString(courses));
/*
        Name: Sobji
        ID: 23
        Courses taken:
        [null, Course_6@63961c42, Course_6@65b54208, null, null, null]
        Name: Chotu
        ID: 35
        Courses taken:
        [null, Course_6@1be6f5c3, Course_6@6b884d57, Course_6@38af3868, null, null]
        Name: Abonti
        ID: 21
        Courses taken:
        [null, Course_6@63961c42, null, null, null, null]
*/

        for(int i=1;i<course_count;i++){
            System.out.println(i+") "+courses[i].code+" "+courses[i].title);
        }
        System.out.println();
    }
}
