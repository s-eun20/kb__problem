package Q3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(56514);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("받는 쪽 소켓 시작");
        System.out.println("받을 준비 끝");
        socket.receive(packet);

        String receivedData = new String(packet.getData(), 0, packet.getLength()).trim();
        System.out.println("받은 데이터: "+new String(receivedData));

        socket.close();


    }
}
