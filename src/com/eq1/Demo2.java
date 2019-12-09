package com.eq1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Auther: szp
 * @Date: 2019/12/9 20:44
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //1.先找到自己写日记的本子
        String filePath="/Users/mac/Desktop/a.txt";
        //2.想好自己的日记内容
        String msg="今天我吃肉了，我很开心";
        //3.将日记内容写到本子上
        File file=new File(filePath);
        Writer writer=new FileWriter(file);
        writer.write(msg);
        //4.写完日记，把日记本锁起来，笔也锁起来
        writer.close();
    }
}
