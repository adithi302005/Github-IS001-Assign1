package Mod3;

 class Calcula {

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    class AdvancedCalculator extends Calcula {
        @Override
        int add(int a, int b) {
            return a + b + 10; // overriding
        }

        public static void main(String[] args) {
            AdvancedCalculator obj = new AdvancedCalculator();

            System.out.println(obj.add(2, 3));      // Overriding
            System.out.println(obj.add(2, 3, 4));   // Overloading
        }
    }

