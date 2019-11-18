/*
* 设计模式四：工厂模式
*
* 工厂方法模式定义：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
*
* 超类从来不管细节，通过实例化正确的披萨类，子类会自行照料这一切
*
* 所有工厂模式都用来封装对象的创建。
* 工厂方法模式通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。
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
