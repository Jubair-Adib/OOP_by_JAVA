public class Student{
    
    public String name;
    public int id;
    
    public Student(){
        
    }

    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    

    public void doClass(){
        System.out.println(name+" is doing theory class.");
    }

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }

}