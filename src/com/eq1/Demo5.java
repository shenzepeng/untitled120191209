package com.eq1;

import java.io.*;

/**
 * @Auther: szp
 * @Date: 2019/12/9 21:00
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        String filePath="/Users/mac/Desktop/a.txt";
        File f=new File(filePath);
        char[] chars=new char[10];
        Reader reader=new FileReader(f);
        int temp=0;
        int count=0;

        while ((temp=reader.read())!=(-1)){
            chars[count++]=(char) temp;
        }

        reader.close();
        System.out.println(count);
        System.out.println("内容为："+new String(chars,0,count));
    }
}
