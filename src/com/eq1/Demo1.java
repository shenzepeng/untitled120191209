package com.eq1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Auther: szp
 * @Date: 2019/12/9 20:42
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo1 {
    public static void main(String[] args) {
        //输入流
        new InputStream() {
            @Override
            public int read() throws IOException {
                //将故事读到笔里
                return 0;
            }
        };

        //输出流
        new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            //讲故事写到记事本上
            }
        };
    }
}
