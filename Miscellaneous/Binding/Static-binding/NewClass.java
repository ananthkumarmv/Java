// main class
public class NewClass {

    // static nested inner class
    public static class SuperClass{

        // Method of inner class
        static void print(){

            // print statement
            System.out.println("print() in superclass is called");
        }
    }

    // static nested inner class
    // class 2
    public static class SubClass extends SuperClass{

        // Method of inner class
        static void print(){
            System.out.println("print() in subclass is called");
        }
    }

    public static void main(String args[]){

        // Creating objects of static inner classes
        // inside main() method
        SuperClass a = new SuperClass();
        SuperClass b = new SubClass();

        // calling method over above objects
        a.print();
        b.print();
    }

}
