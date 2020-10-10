package com.europa.design.principle;

/**
 * 依赖倒置，java里的SPI、面向接口编程，好莱坞原则，就是由此而来
 */
public class DependenceInversion {

    public static void main(String[] args) {
        // 船长需要一个船，并且可以航行过海，船由别人提供，但是我知道我要航行
        Captain captain = new Captain(new Yacht());
        captain.crossTheSea();
    }
}

class Captain {

    Sailing sailing;

    /**
     * 聚合过海的船，我定义好接口，别人去提供实现
     * @param sailing
     */
    Captain (Sailing sailing) {
        this.sailing = sailing;
    }

    public void crossTheSea() {
        sailing.sail();
        System.out.println("过海");
    }

}

interface Sailing {

    void sail();
}

class Yacht implements Sailing {

    @Override
    public void sail() {
        System.out.println("时速八十迈");
    }
}


