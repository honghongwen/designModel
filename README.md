### JAVA知识点大全-学习是一个循序渐进的过程，不可一蹴而就



#### 1.设计模式（重要）



* 工厂模式

  * 简单工厂

  > 简单工厂就是最为简单的创建一个工厂类，然后根据传入的具体参数返回具体实例。
  >
  > 好处，能够隐藏实例的创建，客户端无需调用new。

  ``` java
      public static Game create(String name) {
          switch (name) {
              case "YuanShen" :
                  return new YuanShen();
              case "RebirthWang":
                  return new RebirthWang();
              case "LOL":
                  return new LeagueOfLegends();
          }
          throw new IllegalArgumentException("NOT FOUND GAME YOU WANTED");
      }
  ```

  * 工厂方法

  > 工厂方法就是我们常说的工厂模式，上述的简单工厂有个致命缺点，关键代码中，没新增一个产品，则需要在工厂中做出具体修改。产品数过多或者同事遗忘时，维护性不好，由此，在工厂类上再进行一层抽象，工厂基类。

  ``` java
  public interface GameFactory {
  
      Game create();
  }
  
  
  public class RebirthWangFactory implements GameFactory {
  
      @Override
      public Game create() {
          return new RebirthWang();
      }
  }
  
  public class Test {
  
      public static void main(String[] args) {
          GameFactory factory = new RebirthWangFactory();
          Game game = factory.create();
          game.forFun();
      }
  }
  ```

  * 抽象工厂

  > 抽象工厂是在工厂方法上横向扩展出来的设计，他的意义是在产品族上进行自定义，例如，高中学生小明去网吧上网，玩游戏，饿了要吃东西，同时小明要选择具体的电脑，比如五块钱/小时。那么小明的选择是 LOL + 泡面 + 五块/小时 这种组合。而假如我去上网，那我的选择就是 LOL + 炒饭 + 十元/小时这种。

  ``` java
  public interface InternetCafeFactory {
  
      /**
       * 玩游戏
       *
       * @return
       */
      Game play();
  
      /**
       * 吃饭
       *
       * @return
       */
      Food eat();
  
      /**
       * 消费
       *
       * @return
       */
      Compute consume();
  }
  ```

  ```java
  /**
   * 便宜的网吧套餐
   */
  public class CheapCafeFactory implements InternetCafeFactory {
  
      @Override
      public Game play() {
          return new LeagueOfLegends();
      }
  
      @Override
      public Food eat() {
          return new Noodles();
      }
  
      @Override
      public Compute consume() {
          return new CheapCompute();
      }
  }
  ```

  ```java
  public class Test {
  
      public static void main(String[] args) {
          InternetCafeFactory factory = new CheapCafeFactory();
          factory.play().forFun();
          factory.eat().fillStomach();
          factory.consume().surfingTheInternet();
      }
  }
  ```

  