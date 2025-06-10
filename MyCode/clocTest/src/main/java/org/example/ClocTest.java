package org.example;

import com.jcraft.jsch.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ClocTest {
    public static void main(String[] args) {
        String host = "116.62.40.164";
        String user = "root";
        String password = "Bzyand0505!";
        int port = 22;
        
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            session.setPassword(password);
            
            // 避免首次连接时的主机密钥检查
            session.setConfig("StrictHostKeyChecking", "no");
            
            session.connect();
            
            // 执行前置命令
            String command = "cd /var/wuhm/Java_Project/ && cloc .";
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            channel.setCommand(command);
            
            // 获取命令输出（包括标准输出和错误输出）
            channel.setInputStream(null);
            BufferedReader in = new BufferedReader(new InputStreamReader(channel.getInputStream()));
            BufferedReader errIn = new BufferedReader(new InputStreamReader(channel.getErrStream())); // 捕获错误输出
            
            channel.connect();
            
            // 读取标准输出
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            
            // 读取错误输出（如果有）
            String errLine;
            while ((errLine = errIn.readLine()) != null) {
                System.err.println("错误输出: " + errLine);
            }
            
            channel.disconnect();
            session.disconnect();
            
        } catch (JSchException | IOException e) {
            e.printStackTrace();
        }
    }
}