package serverSide;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStartup {

    
    
    
    public static void main(String[] args) {
        try{
        ServerSocket listen = new ServerSocket(7070);
        
            while (true) {
                Socket client = listen.accept();
                
                
            }
        
        }catch(IOException e){
        }
        
        
        
    }
    
}
