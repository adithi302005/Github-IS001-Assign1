package Mod3;
class Shape {
    void draw() {
            System.out.println("Drawing Shape");
        }
    }

    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Rectangle extends Shape {
        void draw() {
            System.out.println("Drawing Rectangle");
        }

        public static void main(String[] args) {
            Shape s1 = new Circle();
            Shape s2 = new Rectangle();

            s1.draw();
            s2.draw();
        }
    }

