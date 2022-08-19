package model;

import java.io.IOException;
import java.net.ServerSocket;

public class MainServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12344);
        Server server = new Server(serverSocket);
        server.startServer();



    }
}
