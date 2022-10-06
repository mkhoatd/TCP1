import java.io.DataInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        var socket=new Socket("localhost", 7788);
        var dis=new DataInputStream(socket.getInputStream());
        var time=dis.readUTF();
        System.out.println(time);
        socket.close();
    }
}
