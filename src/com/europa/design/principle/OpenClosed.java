package com.europa.design.principle;

/**
 * 开闭原则
 */
public class OpenClosed {

    /**
     * 开闭原则，讲的是设计上应该对扩展开放，对修改关闭。最直观对是工厂方法和简单工厂对区别
     * @param args
     */
    public static void main(String[] args) {
        // 如果后续不停对加产品？不停对修改factory
        Factory.create(1).shape();

        // 往上抽象出工厂、后续继续加工厂就可以
        new ProdAFactory().create().shape();
    }

}



class Factory {

    public static Production create(int i) {
        if (i == 1) {
            return new ProdA();
        }
        if (i == 2) {
            return new ProdB();
        }
        return null;
    }
}

interface Production {
    void shape();
}

class ProdA implements Production {

    @Override
    public void shape() {
        System.out.println("圆形产品");
    }
}

class ProdB implements Production {

    @Override
    public void shape() {
        System.out.println("方形产品");
    }
}

interface ProdFactory {

    Production create();
}

class ProdAFactory implements ProdFactory {

    @Override
    public Production create() {
        return new ProdA();
    }
}