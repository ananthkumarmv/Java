class Test extends Thread{
    public void run(){
        System.out.println("Inside Test thread");;
    }
}

public class Main {
    public static void main(String args[]){
        Test t = new Test();
        t.start();
        System.out.println("Inside Main Thread");
    }
}
