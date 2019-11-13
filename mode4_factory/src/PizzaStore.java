/*
 * 简单工厂模式
 *
 * 利用静态方法定义一个简单的工厂，是很常见的技巧，被称为静态工厂，这样可以不需要使用创建对象的方法来实例化对象，
 * 但是缺点是不能通过继承来改变创建方法的行为
 * */

public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
