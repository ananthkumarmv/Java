// name of the package to be created
package FirstPackage;

// class in which the above created package belong to
public class Welcome {
    // main driver method
    public static void main(String []args){
        //Print statement for the successful
        // compilation and execution of the program

        System.out.println("This is the first package program...");

    }
}

// Command: javac Welcome.java
// Command: javac -d . Welcome.java   -> This Command Will Create a New Folder Called  FirstPackage. 
// Command: java FirstPackage.Welcome 