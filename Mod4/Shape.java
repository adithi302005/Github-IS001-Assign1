package Mod4;


    abstract class TestShape {
        abstract double area();
    }

    class Circle extends TestShape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends TestShape {
        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double area() {
            return length * width;
        }
    }

    public class Shape {
        public static void main(String[] args) {
            TestShape c = new Circle(5);
            TestShape r = new Rectangle(4, 6);

            System.out.println("Circle Area: " + c.area());
            System.out.println("Rectangle Area: " + r.area());
        }
    }

