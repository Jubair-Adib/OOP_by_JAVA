public class Cat{
    public String color;
    public String action="Sitting";
    // dif between instance variable and local variable
    public void change_action(String action){
        this.action=action;
        //this.action=action;
        //this.instace variable=local variable
    }
    public void details(){
        System.out.println(color+" cat is "+action);
    }
}
