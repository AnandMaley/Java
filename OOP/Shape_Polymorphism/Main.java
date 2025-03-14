class Shape{
    public void calculate(double radius){
        System.out.println("Radius: "+(3.14*radius*radius));
    }
    public void calculate(int length,int width){
        System.out.println("Area: "+(length*width));
    }
    public void calculate(int side){
        System.out.println("Side: "+(side*side));
    }
    public void display(){
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape{
    @Override
    public void display(){
        System.out.println("This is a Circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void display(){
        System.out.println("This is a Rectangle");
    }
}
class Square extends Shape{
    @Override
    public void display(){
        System.out.println("This is a Square");
    }
}

public class Main{
    public static void main(String[] args) {
        Shape sh = new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        c.calculate(5.5);
        r.calculate(4,5);
        s.calculate(5);
        sh.display();
        c.display();
        r.display();
        s.display();
    }
}