package com.demo.v3.server;

import com.demo.constant.Constants;
import com.demo.v3.TaskExecutorStepBean;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yubo7 on 2016/8/16.
 */
public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(Constants.PORT);
        System.out.println("server started...");
        Socket socket = ss.accept();
        System.out.println("a client connected!");
        TaskExecutorStepBean.TaskExecutorStep taskExecutorStep = TaskExecutorStepBean.TaskExecutorStep.parseFrom(socket.getInputStream());
        if (taskExecutorStep != null) {
            System.out.println(taskExecutorStep.toString());
        }
    }

}
