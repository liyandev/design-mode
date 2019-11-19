/*
* 简单工厂模式
*
* 对订单的处理能够一致
* 差异在于制作披萨的风味
* 做法是让子类负责定义自己的createPizza（）方法
*
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
}
