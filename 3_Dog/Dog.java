public class Dog {
    public String name;
    public void bark(String name){
        this.name=name;
        System.out.println(name+" is barking");
    }
    // method overloading 
    public void eat(String fd){
        System.out.println(name+" is eating "+fd);
    }
    public void eat(String fd, int qn){
        System.out.println(name+" is eating " + qn + fd);
    }
}
