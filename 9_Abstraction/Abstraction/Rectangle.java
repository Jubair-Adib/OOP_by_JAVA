public class Rectangle extends Shape{
    Rectangle(double w,double h){
        super(w,h);
    }
    @Override
    void area(){
        double r=d1*d2;
        System.out.println("Area of Rectangle is "+r+" unit square");
    }
}