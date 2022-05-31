class NoExceptionAtTryBlock
{
    public static void main (String[] args)
    {
         
        try
        {
             
            String str = "123";
                 
            int num = Integer.parseInt(str);
                 
            // this statement will execute
            // as no any exception is raised by above statement
            System.out.println("Inside try block");
             
        }
         
        catch(NumberFormatException ex)
        {
                 
            System.out.println("catch block executed...");
                 
        }
 
        System.out.println("Outside try-catch clause");
    }
}
