package Q3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("127.0.0.1");

        String str = "I am an android programmer!";
        byte[] buf = str.getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, 56514);


        socket.send(packet);
        System.out.println("클라이언트 포트>> "+packet.getPort());
        socket.close();
    }
}
