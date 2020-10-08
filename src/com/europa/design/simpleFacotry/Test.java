package com.europa.design.simpleFacotry;

/**
 * 简单工厂
 * 好处，不需要去new具体产品，只需要传入参数，从而工厂基类会帮助创建产品。
 * 缺点，每次添加新产品需要在工厂基类上修改代码。从而不满足对扩展开放，对修改关闭原则。
 */
public class Test {

    public static void main(String[] args) {
        Game game = GameFactory.create("LOL");
        game.forFun();
    }
}
