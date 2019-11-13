/*
* createPizza()方法是工厂方法，用来制造产品
* */

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else return null;
    }
}