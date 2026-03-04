package Mod5;

    class A {}
    class B {}

    public class DeadlockDemo {
        public static void main(String[] args) {

            A obj1 = new A();
            B obj2 = new B();

            Thread t1 = new Thread(() -> {
                synchronized (obj1) {
                    System.out.println("Thread1 locked A");
                    try { Thread.sleep(100); } catch (Exception e) {}
                    synchronized (obj2) {
                        System.out.println("Thread1 locked B");
                    }
                }
            });

            Thread t2 = new Thread(() -> {
                synchronized (obj2) {
                    System.out.println("Thread2 locked B");
                    try { Thread.sleep(100); } catch (Exception e) {}
                    synchronized (obj1) {
                        System.out.println("Thread2 locked A");
                    }
                }
            });

            t1.start();
            t2.start();
        }
    }

