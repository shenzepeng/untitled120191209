package com.eq1;

import javafx.beans.binding.ObjectBinding;

/**
 * @Auther: szp
 * @Date: 2019/12/9 20:54
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo4 extends Object {
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Demo4{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Demo4 demo4=new Demo4();
        demo4.setId(1);
        System.out.println(demo4);
    }
}
