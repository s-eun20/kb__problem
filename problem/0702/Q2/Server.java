package Q2;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws Exception {
        int count = 0;

        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("서버 소켓 시작");
        System.out.println("클라이언트의 요청을 기다리는 중...");

        while(true) {
            Socket socket = serverSocket.accept();
            count++;
            System.out.println("서버가 "+count+"개의 클라이언트 요청을 승인함.");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String date = "I am a java programmer!!";
            out.print(date);
            out.close();
            socket.close();
        }

    }
}
