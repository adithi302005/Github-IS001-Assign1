package Mod4;


    class Student {
        int rollNo;
        String name;
        static String college = "VTU";

        Student(int r, String n) {
            rollNo = r;
            name = n;
        }

        static void changeCollege() {
            college = "MIT";
        }

        void display() {
            System.out.println(rollNo + " " + name + " " + college);
        }
    }

    public class TestStatic {
        public static void main(String[] args) {
            Student.changeCollege();

            Student s1 = new Student(1, "Aditi");
            Student s2 = new Student(2, "Rahul");

            s1.display();
            s2.display();
        }
    }

