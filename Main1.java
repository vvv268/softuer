
class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }
   
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}

public class Main1 {
    public static void main(String[] args) {
        
       
        Rectangle rect = new Rectangle(5.0, 3.0);

        
        Rectangle square = new Rectangle(4.0, 4.0);

      
        System.out.println("Правоъгълник:");
        System.out.println("Лице: " + rect.calculateArea());
        System.out.println("Периметър: " + rect.calculatePerimeter());
        System.out.println("Квадрат ли е? " + rect.isSquare());

        System.out.println("\nКвадрат:");
        System.out.println("Лице: " + square.calculateArea());
        System.out.println("Периметър: " + square.calculatePerimeter());
        System.out.println("Квадрат ли е? " + square.isSquare());
    }
}
