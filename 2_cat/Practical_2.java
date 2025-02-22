// dif between instance variable and local variable

/*
public class Cat{
    public String color;
    public String action="Sitting";
    public void change_action(String action){
        this.action=action;
        //this.action=action;
        //this.instace variable=local variable
    }
    public void details(){
        System.out.println(color+" cat is "+action);
    }
}
*/ 

public class Practical_2{
    public static void main(String [] args){
        Cat c1= new Cat();
        Cat c2= new Cat();
        c1.color="Black";
        c2.color="Brown";
        c1.details();
        c2.details();
        c1.change_action("Jumping");
        c2.change_action("Crying");
        c1.details();
        c2.details();
    }
}
