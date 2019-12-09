package com.eq1;

import java.io.*;

/**
 * @Auther: szp
 * @Date: 2019/12/9 21:12
 * @Description: 将字节输入流变为一个字符输入流
 */
public class Demo7 {

    public static void main(String[] args) throws IOException {
        String filePath="/Users/mac/Desktop/a.txt";
        File file=new File(filePath);
        //读成字节
        FileInputStream fileInputStream = new FileInputStream(file);
        //将字节流 byte转换为字符流
        Reader reader=new InputStreamReader(fileInputStream);
        char[] b=new char[100];
        int lem=reader.read(b);
        System.out.println(new String(b,0,lem));
        reader.close();
    }
}
