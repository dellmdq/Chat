package com.company;

import java.net.*;
import java.io.*;
import java.util.Scanner;


public class Client {
    private Socket socket;
    private BufferedReader inputBuffer = null;
    private PrintStream outputBuffer = null;
    Scanner text = new Scanner(System.in);
    final String TERMINATION_COMMAND = "X";

    public void getConnection(String ip, int port) {
        try {
            socket = new Socket(ip, port);
            showText("Connected to :" + socket.getInetAddress().getHostName());
        } catch (Exception e) {
            showText("Exception on getConnection(): " + e.getMessage());
            System.exit(0);
        }
    }

    public static void showText(String s) {
        System.out.println(s);
    }

    public void buffer() {
        try {
            inputBuffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outputBuffer = new PrintStream(socket.getOutputStream());
            outputBuffer.flush();
        } catch (IOException e) {
            showText("Error getting buffers.");
        }
    }

    public void send(String s) {
        try {
            outputBuffer.println(s);
            outputBuffer.flush();
        } catch (Exception e) {
            showText("IOException on send");
        }
    }

    public void closeConnection() {
        try {
            inputBuffer.close();
            outputBuffer.close();
            socket.close();
            showText("Connection ended.");
        } catch (IOException e) {
            showText("IOException on closeConnection()");
        }finally{
            System.exit(0);
        }
    }

    public void runConnection(String ip, int port) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    getConnection(ip, port);
                    buffer();
                    getData();
                } finally {
                    closeConnection();
                }
            }
        });
        thread.start();
    }

    public void getData() {
        String st = "";
        try {
            do {
                st = inputBuffer.readLine();
                showText("\n[Server] => " + st);
                System.out.print("\n[You] => ");
            } while (!st.equals(TERMINATION_COMMAND));
        } catch (IOException e) {}
    }

    public void writeData() {
        String input = "";
        while (true) {
            System.out.print("[You] => ");
            input = text.nextLine();
            if(input.length() > 0)
                send(input);
        }
    }

    public static void main(String[] args) {
        try {
            Client client = new Client();
            Scanner scanner = new Scanner(System.in);
            showText("Enter IP: ");
            String ip = scanner.nextLine();

            showText("Port: ");
            String port = scanner.nextLine();
            client.runConnection(ip, Integer.parseInt(port));
            client.writeData();

        }catch(Exception ex){
            System.out.println("Incorrect parameters.\n");
            System.out.println(ex.getMessage());
        }
    }
}