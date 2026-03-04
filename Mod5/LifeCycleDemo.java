package Mod5;

    class LifeCycleDemo extends Thread {
        public void run() {
            System.out.println("Thread is running");
        }

        public static void main(String[] args) {
            LifeCycleDemo t = new LifeCycleDemo();

            System.out.println("State after creation: " + t.getState());

            t.start();
            System.out.println("State after start: " + t.getState());
        }
    }

