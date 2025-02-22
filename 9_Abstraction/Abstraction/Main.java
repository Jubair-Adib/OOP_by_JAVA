public class Main {
    public static void main(String[] args){
        Shape s;
        
        s=new Rectangle(3,4);
        s.area();

        s=new Triangle(12,15);
        s.area();

        s=new Circle(5);
        s.area();

    }
}