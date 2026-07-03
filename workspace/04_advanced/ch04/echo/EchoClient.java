package ch04.echo;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    void startClient(){
        try{
            Socket s = new Socket("localhost",50000);
        }catch (IOException e){
            System.err.println("네트워크 오류 발생 : " + e.getMessage());
        }

    }
    void main(){
        startClient();
    }
}
