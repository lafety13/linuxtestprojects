import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    private static Socket connection;
    private static BufferedWriter out;
    private static BufferedReader in;
    private static ServerSocket serverSocket;

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(1212, 10);
            while (true) {
                connection = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()), true);
                out.write(in.readLine());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
