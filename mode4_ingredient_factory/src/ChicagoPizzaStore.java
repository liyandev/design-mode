/*
* createPizza()方法是工厂方法，用来制造产品
* */

public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }else return null;

        return pizza;
    }
}