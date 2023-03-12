    abstract class Shape {
        abstract double RectangleArea(double length, double breadth);
        abstract double SquareArea(double side);
        abstract double CircleArea(double radius);
    } 
    class Rectangle extends Shape {
        double RectangleArea(double length, double breadth) {
            return length * breadth;
        }
        double SquareArea(double side) {
            return 0; 
        }
        double CircleArea(double radius) {
            return 0; 
        }
    }
    class Square extends Shape {
        double RectangleArea(double length, double breadth) {
            return 0; 
        }
        double SquareArea(double side) {
            return side * side;
        }
        double CircleArea(double radius) {
            return 0; 
        }
    }
    class Circle extends Shape {
        double RectangleArea(double length, double breadth) {
            return 0; 
        }
        
        double SquareArea(double side) {
            return 0; // Not applicable for circle
        }
        double CircleArea(double radius) {
            return Math.PI * radius * radius;
        }
    }

