public class LambdaExpToCreateObj {
    public static void main(String args[]){
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }
}
