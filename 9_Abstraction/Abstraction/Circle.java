public class Circle extends Shape{

    Circle(double ra){
        super(ra,ra);
    }
    @Override
    void area(){
        double r=Math.PI*d1*d2;
        System.out.println("Area of Circle is "+r+" unit square");
    }
}