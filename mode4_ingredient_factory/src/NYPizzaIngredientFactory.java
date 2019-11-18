import NYIngredient.*;
import ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough(){
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSouce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(),new Onion(),new Mushroom(),new RedPepper() };
        return veggies;
    }

    @Override
    public Clam createClams() {
        return new FreshClam();
    }
    @Override
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
}
