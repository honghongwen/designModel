package com.europa.design.principle;

/**
 * 接口隔离
 */
public class InterfaceIsolation {

    /**
     * 指接口的定义，粒度不能太大，要区分好他的边界
     * @param args
     */
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.feed(new Cat());
    }
}

/**
 * 行为接口
 */
interface Action {
    void run();
    void fly();
    void swim();
}

/**
 * 问题出现了，下面这几个方法的意义？ 应当将其细分为几个接口，如Running、Flying、Swimming
 */
class Cat implements Action {

    @Override
    public void run() {
        System.out.println("猫跑了");
    }

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }
}

class Pet {

    public void feed(Action animal) {
        animal.run();
    }
}