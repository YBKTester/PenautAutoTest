package com.bink.lesson.day26.ex;

/**
 * @author yangbingkun
 * 2020/7/24 --4:19 下午
 */
public class Zi extends Fu {
    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }


    public Zi() {
        super();
        System.out.println("子雷构造方法");
    }
}
