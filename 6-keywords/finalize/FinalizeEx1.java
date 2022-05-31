public class FinalizeEx1 {  
     public static void main(String[] args)   
    {   
        String s = new String("RR");
        s = null;
  
        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }
  
    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overriden");
    }
}  