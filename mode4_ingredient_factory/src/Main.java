/*
* 设计模式四：工厂模式之抽象工厂模式
*
* 引入新类型的工厂，也就是抽象工厂，来创建披萨原料家族
* 通过抽象工厂所提供的接口，可以创建产品的家族，利用这个接口写代码，我们的代码将从实际工厂解耦，以便在不同上下文中
* 实现各式各样的工厂，制造出各种不同的产品。
* 因为代码从实际的产品中解耦了，所以我们可以替换不同的工厂来取得不同的行为。
*
* 定义：抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
*      工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
* */

public class Main {
    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName());

    }
}
