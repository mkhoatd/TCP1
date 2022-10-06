import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws Exception {
        var server = new ServerSocket(7788);
        System.out.println("server is started");
        while (true) {
            var socket = server.accept();
            var dos = new DataOutputStream(socket.getOutputStream());
            var time = new Date().toString();
            dos.writeUTF("dmm"+time);
            socket.close();
        }
    }
}