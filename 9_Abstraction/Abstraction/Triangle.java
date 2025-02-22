public class Triangle extends Shape{
    Triangle(double b,double h){
        super(b,h);
    }
    @Override
    void area(){
        double r=0.5*d1*d2;
        System.out.println("Area of Triangle is "+r+" unit square");
    }
}