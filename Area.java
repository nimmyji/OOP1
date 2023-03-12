public class Area {
        void RectangleArea(double length, double breadth) {
            Rectangle rectangle = new Rectangle();
            double area = rectangle.RectangleArea(length, breadth);
            System.out.println("Area of Rectangle: " + area);
        }
        
        void SquareArea(double side) {
            Square square = new Square();
            double area = square.SquareArea(side);
            System.out.println("Area of Square: " + area);
        }
        
        void CircleArea(double radius) {
            Circle circle = new Circle();
            double area = circle.CircleArea(radius);
            System.out.println("Area of Circle: " + area);
        }
    }
    

