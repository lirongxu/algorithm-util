package com.lemon.algorithm;

import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 李荣许
 * @create 2021/1/18
 */
@SpringBootTest
public class BioSocketTest {

    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ServerSocket serverSocket = new ServerSocket(8080);

        while(true) {
            Socket socket = serverSocket.accept();
            executorService.execute(() -> {
                try {
                    handle(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

    }

    private  static void handle(Socket socket) throws IOException {
        byte[] bytes = new byte[1024];
        InputStream inputStream = socket.getInputStream();
        while(true) {
            int read = inputStream.read(bytes);
            if(read != -1) {
                System.out.println("client data:" + new String(bytes, 0, read));
            } else {
                break;
            }
        }
    }
}
