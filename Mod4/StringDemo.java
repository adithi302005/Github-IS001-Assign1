package Mod4;

public class StringDemo {

        public static void main(String[] args) {

            // String (Immutable)
            String s = "Hello";
            s.concat(" World");
            System.out.println("String: " + s); // No change

            // StringBuilder (Mutable, Not Thread Safe)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println("StringBuilder: " + sb);

            // StringBuffer (Mutable, Thread Safe)
            StringBuffer sf = new StringBuffer("Hello");
            sf.append(" World");
            System.out.println("StringBuffer: " + sf);
        }
    }

