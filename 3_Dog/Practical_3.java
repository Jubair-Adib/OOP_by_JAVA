/*
public class Dog {
    public String name;
    public void bark(String fd){
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
*/

public class Practical_3 {
    public static void main(String [] args){
        Dog d1=new Dog();
        d1.bark("Buru");
        d1.eat("bread");
        d1.eat("cake",4);
    }
}
