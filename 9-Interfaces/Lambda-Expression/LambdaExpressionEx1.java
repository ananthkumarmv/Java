interface FuncInterface{

    // an abstract method
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");

    }
}


public class LambdaExpressionEx1 {
    
    public static void main(String args[]){

        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2*x);

        fobj.abstractFun(5);
        fobj.normalFun();
    }
}
