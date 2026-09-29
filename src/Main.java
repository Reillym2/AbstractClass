

public class Main {

    public static void main(String[] args) {
        Shape s1;
        // What value can s1 hold? It holds a refence

        // You cannot create object for abstract class?
//        s1 = new Shape();
        s1 = new Circle("Black", 30.5);

        Shape s2 = new Rectangle("Gold",20,25);

        Shape[] shapes = new Shape[2];
        shapes[0] = s1;
        shapes[1] = s2;

        for (Shape sh: shapes){
            //Shape sh : shapes - tells to provide all the indexed values inside shapes array one by one until nothing left
            //Shapes sh=s1
            //Shapes sh=s2
            sh.calculateArea();  // Invoking reference - specific calculateArea()
        }
        //This is the same as the first for loop
//        for (int i = 0; i< shapes.length; i++){
//            shapes[i].calculateArea();
//        }
    }
}
