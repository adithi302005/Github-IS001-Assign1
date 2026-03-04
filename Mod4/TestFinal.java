package Mod4;


    final class FinalClass {
        final int x = 10; // final variable

        final void display() { // final method
            System.out.println("Final Method");
        }
    }

    public class TestFinal {
        public static void main(String[] args) {
            FinalClass obj = new FinalClass();
            obj.display();
            System.out.println("Final Variable: " + obj.x);
        }
    }

