
// If a class inherit an abstract class than the subclass/base class must provide definition of the
// inherited abstract class
public class Circle extends Shape {
    double radius;

    Circle(){
       super();
       // this.color= "";
        this.radius= 0;

    }
    Circle (String color, double radius){
    //    this.color = color;
        super(color);
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        double area = 3.1415 * this.radius* this.radius;
        System.out.println("Circle area: " + area);
    }
}
