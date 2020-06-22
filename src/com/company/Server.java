package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private Socket socket;
    private ServerSocket serverSocket;
    private DataInputStream inputBuffer = null;
    private DataOutputStream outputBuffer = null;
    Scanner scanner = new Scanner(System.in);
    final String TERMINATION_COMMAND = "X";

    public void getConnection(int port) {
        try {
            serverSocket = new ServerSocket(port);
            showText("Waiting for connection on port " + String.valueOf(port) + "...");
            socket = serverSocket.accept();
            showText("Connection established: " + socket.getInetAddress().getHostName() + "\n\n\n");
        } catch (Exception e) {
            showText("Error in getConnection(): " + e.getMessage());
            System.exit(0);
        }
    }
    public void buffer() {
        try {
            inputBuffer = new DataInputStream(socket.getInputStream());
            outputBuffer = new DataOutputStream(socket.getOutputStream());
            outputBuffer.flush();
        } catch (IOException e) {
            showText("Error opening buffers.");
        }
    }

    public void receiveData() {
        String st = "";
        try {
            do {
                st = (String) inputBuffer.readUTF();
                showText("\n[Client] => " + st);
                System.out.print("\n[You] => ");
            } while (!st.equals(TERMINATION_COMMAND));
        } catch (IOException e) {
            this.closeConnection();
        }
    }


    public void send(String s) {
        try {
            outputBuffer.writeUTF(s);
            outputBuffer.flush();
        } catch (IOException e) {
            showText("Error on send(): " + e.getMessage());
        }
    }

    public static void showText(String s) {
        System.out.print(s);
    }

    public void writeData() {
        while (true) {
            System.out.print("[You] => ");
            send(scanner.nextLine());
        }
    }

    public void closeConnection() {
        try {
            inputBuffer.close();
            outputBuffer.close();
            socket.close();
        } catch (IOException e) {
            showText("Exception on closeConnection(): " + e.getMessage());
        } finally {
            showText("Chat ended...");
            System.exit(0);

        }
    }

    public void runConnection(int port) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        getConnection(port);
                        buffer();
                        receiveData();
                    } finally {
                        closeConnection();
                    }
                }
            }
        });
        thread.start();
    }

    public static void main(String[] args) throws IOException {
        Server s = new Server();
        int port = 3000;
        s.runConnection(port);
        s.writeData();
    }
}

