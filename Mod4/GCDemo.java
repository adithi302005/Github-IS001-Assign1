package Mod4;


public class GCDemo {

    public static void main(String[] args) {

        GCDemo obj1 = new GCDemo();


        obj1 = null;


        System.gc();

        System.out.println("object eligible for garbage collection");
    }


}

