package Mod5;

    import java.io.*;

    public class ExceptionDemo {
        public static void main(String[] args) {

            // Unchecked Exception
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Unchecked Exception: " + e);
            }

            // Checked Exception
            try {
                FileReader file = new FileReader("test.txt");
            } catch (IOException e) {
                System.out.println("Checked Exception: " + e);
            }
        }
    }

