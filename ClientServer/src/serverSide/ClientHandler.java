package serverSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;

public class ClientHandler implements Runnable {

    private Socket clientSocket;
    private ArrayBlockingQueue<String> msg;
    private BufferedReader in;
    private PrintWriter out;

    // Constructor
    public ClientHandler(Socket con, ArrayBlockingQueue msg) throws IOException {
        this.clientSocket = con;
        this.msg = msg;
        openStreams();
    }

    private void openStreams() throws IOException {
        this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        this.out = new PrintWriter(clientSocket.getOutputStream());
    }

    // Thread method
    @Override
    public void run() {

    }

}
