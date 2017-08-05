import java.io.*;
import java.net.Socket;

public class Ckient implements Runnable {
    private static Socket connection;
    private static PrintWriter out;
    private static BufferedReader in;

    public static void main(String[]args) throws IOException {
        new Thread(new Ckient()).start();
    }

    public Ckient() {
    }

    @Override
    public void run() {
        try {
            System.out.println(1);

                connection = new Socket("127.0.0.1", 1212);
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()), true);
                System.out.println(in.readLine());
                sendData("hello");
                connection.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void sendData(String obj) throws IOException {
        out.flush();
        out.print(obj);
    }
}
