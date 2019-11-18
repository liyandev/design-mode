/*
* 创建者类（Creator)
* 抽象创建者类，定义了一个抽象的工厂方法createPizza()，让子类实现此方法制造产品。
* 创建者通常都会包含依赖于抽象产品的代码，而这些抽象产品由子类制造，创建者不需要真的知道哪种具体产品。
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
