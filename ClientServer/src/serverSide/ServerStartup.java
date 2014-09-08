package serverSide;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;

public class ServerStartup {

    private static ArrayBlockingQueue<String> msg;

    // Main
    public static void main(String[] args) {
        try {
            ServerSocket listen = new ServerSocket(7070);
            msg = new ArrayBlockingQueue(20);

            
            
            while (true) {
                Socket client = listen.accept();
                new Thread(new ClientHandler(client, msg)).start();
            }

        } catch (IOException e) {
        }

    }

}
