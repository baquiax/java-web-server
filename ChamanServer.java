import java.net.ServerSocket;
import edu.galileo.baquiax.HttpRequest;

public final class ChamanServer {
    private static final int PORT = 80;
    public static void main(String args[]) {        
        try {
            ServerSocket ss = new ServerSocket(PORT);
            while (true) {
                try {
                    Thread t = new Thread (new HttpRequest(ss.accept()));
                    t.start();
                } catch (Exception e) {

                }        
            }   
        } catch (Exception e) {
            System.exit(0);
        }        
    }
}