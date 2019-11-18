import ingredient.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSouce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClams() {
        return null;
    }
}
