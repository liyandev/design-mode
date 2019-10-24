/*
* 模式三：装饰者模式
* 动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
*
* 设计原则1：类应该对扩展开放，对修改关闭
*
* */

public class Main {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage b2 = new Espresso();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + "$" + b2.cost());
    }
}
