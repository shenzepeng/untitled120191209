package com.eq2;

import java.io.IOException;
import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/9 21:17
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo1 {
    //小明的妈妈，在小明表现不好的时候，会打小明，会让小明写检讨（将脑子的检讨写到磁盘上）
    public static void main(String[] args) throws InterruptedException, IOException {
        Person mother = new Person();
        mother.setId(1);
        mother.setSex("女");
        mother.setMember("妈妈");
        mother.setAge("40");

        Person xiaoMing = new Person();
        xiaoMing.setId(2);
        xiaoMing.setMember("儿子");
        xiaoMing.setSex("男");
        xiaoMing.setAge("12");

        while (true){
            int random =(int) (Math.random()*10);
            //如果没写作业就打小明
            if (random>5) {
                XieJianTao xieJianTao = new XieJianTao();
                xieJianTao.setContent("不好好写作业，所以要写检讨"+new Date());
                xieJianTao.setFilePath("/Users/mac/Desktop/"+new Date()+".txt");
                xieJianTao.setPersonId(2);
                xieJianTao.setMotherId(1);
                //模拟每天，
                Thread.sleep(10);
                //写检讨的行为，方法
                xieJianTao.writeWords(xieJianTao.getContent(),xieJianTao.getFilePath());

            }
        }


    }
}
