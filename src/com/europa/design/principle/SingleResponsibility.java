package com.europa.design.principle;


/**
 * 单一职责，每个类负责单一的功能模块，如果不满足，代表该拆分了，具体拆分方法还是拆分单独类，自己取舍。
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        // 都以实际开发中可能碰到的问题，以前不知道怎么做决策，仅凭感觉。拿起设计原则工具后，就有理论的知道为什么这么做，依据是什么了。
        // 比如 现实开发时，我会碰到根据订单的发货方式，进行不同的发货处理。
        LogisticsServiceA logistics = new LogisticsServiceA();
        logistics.deliver("need-logistics");
        // 当其是无需物流时，可能就不需要那么复杂的流程，并且后续的操作也不一致
        logistics.deliver("none-logistics");
        // 当其是电子面单时，可能逻辑又不相同
        logistics.deliver("electronic-logistics");
        // 许多类似的问题，从当时的情况上来看，是没有问题的，但随着业务越来越臃肿，慢慢的就会发现deliver里面的代码就越来越臃肿，后续极难扩展。
        // 设计模式，确实是一种精巧的建筑设计转移过来的代码工业设计，在大型项目中，设计模式必不可少。小型应用中大家自己斟酌，很喜欢有个词叫设计之美，当然，适度就好。
        // 后续如果继续往上怼业务... 且deliver方法越来越臃肿
        logistics.deliver("same-city-logistics");

        // 所以将其拆分出来，每个类负责具体的发货方法，易于扩展，但是，同样带来了类爆炸的问题。所以，中间的度要拿捏好，什么时候该拆，什么时候合并
        NoneLogistics noneLogistics = new NoneLogistics();
        noneLogistics.deliver();

        // 折中的方法，拿捏好度
        LogisticsServiceB logisticsServiceB = new LogisticsServiceB();
        logisticsServiceB.noneLogisticsDeliver();
    }
}

// 发货服务
class LogisticsServiceA {

    public void deliver(String deliverType) {
        switch (deliverType) {
            // 有些很奇怪的人会问 default语句能不能写在上面 - -！
            default:
                System.out.println("发货失败...");
            case "need-logistics":
                System.out.println("您的物流已发货，请后续注意查收...");
                break;
            case "none-logistics":
                System.out.println("您充值的点卡已出单，请注意查收...");
                break;
            case "electronic-logistics":
                System.out.println("您的物流已由xxx通代发货，请注意查收");
                break;
        }
    }
}

// 发货服务
class LogisticsServiceB {
    public void needLogisticsDeliver() {
        System.out.println("您的物流已发货，请后续注意查收...");
    }

    public void noneLogisticsDeliver() {
        System.out.println("您充值的点卡已出单，请注意查收...");
    }
}

class NoneLogistics {
    public void deliver() {
        System.out.println("您充值的点卡已出单，请注意查收...");
    }
}

class NeedLogistics {
    public void deliver() {
        System.out.println("您的物流已发货，请后续注意查收...");
    }
}

