/*
* 模式四：工厂模式
*
* 对订单的处理能够一致
* 差异在于制作披萨的风味
* 做法是让子类负责定义自己的createPizza（）方法
*
* */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
