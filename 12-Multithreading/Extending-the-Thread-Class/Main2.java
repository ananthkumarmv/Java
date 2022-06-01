class Test extends Thread{
    public void run(){
        for(int i=0; i<5; i++)
            System.out.println("Inside Test Thread");
    }
}

public class Main2 {
    public static void main(String args[]) throws InterruptedException{
        Test t = new Test();
        t.start();
        for(int i=0; i<5; i++){
            System.out.println("Inside Main method");
            Thread.sleep(1);
        }
    }
}
 