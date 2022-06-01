public class NewClass {
    // Static nested inner class
    // Class 1
    public static class SuperClass {
 
        // Method of inner class 1
        void print()
        {
 
            // Print statement
            System.out.println(
                "print() in SuperClass is called");
        }
    }
 
    // Static nested inner class
    // Class 2
    public static class SubClass extends SuperClass {
 
        // Method of inner class 2
        @Override void print()
        {
 
            // Print statement
            System.out.println(
                "print() in SubClass is called");
        }
    }
 
    // Method inside main class
    public static void main(String[] args)
    {
 
        // Creating object of inner class 1
        // with reference to constructor of super class
        SuperClass A = new SuperClass();
 
        // Creating object of inner class 1
        // with reference to constructor of sub class
        SuperClass B = new SubClass();
 
        // Calling print() method over above objects
        A.print();
        B.print();
    }
}
