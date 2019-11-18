public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory ;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSouce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClams();
    }
}
