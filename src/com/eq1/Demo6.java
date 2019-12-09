package com.eq1;

import java.io.*;

/**
 * @Auther: szp
 * @Date: 2019/12/9 21:03
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        String filePath="/Users/mac/Desktop/a.txt";
        File file=new File(filePath);

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        Writer out= new OutputStreamWriter(fileOutputStream);

        out.write("你好");
        out.close();
    }
}
