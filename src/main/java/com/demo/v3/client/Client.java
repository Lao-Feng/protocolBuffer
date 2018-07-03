package com.demo.v3.client;

import com.demo.constant.Constants;
import com.demo.v3.TaskExecutorStepBean;
import java.io.OutputStream;
import java.net.Socket;


/**
 * Created by yubo7 on 2016/8/16.
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", Constants.PORT);
        //构造一个Person对象
        TaskExecutorStepBean.StepInfo stepInfo = TaskExecutorStepBean.StepInfo.newBuilder()
                .setStepName("name")
                .setEndTime("endTime")
                .build();

        TaskExecutorStepBean.StepInfo stepInfo1 = TaskExecutorStepBean.StepInfo.newBuilder()
                .setStepName("name111111")
                .setEndTime("endTime111111")
                .build();


        TaskExecutorStepBean.TaskExecutorStep taskExecutorStep = TaskExecutorStepBean.TaskExecutorStep
                .newBuilder()
                .setJobTaskID("JobTaskID")
                .setAntennaID("AntennaID")
                .addSteps(stepInfo)
                .addSteps(stepInfo1)
                .build();

        OutputStream os = socket.getOutputStream();
        os.write(taskExecutorStep.toByteArray());
        os.flush();
        //这里注意一定要关闭流，否则服务端会报错
        os.close();
        System.out.println("client send person");
    }



}
