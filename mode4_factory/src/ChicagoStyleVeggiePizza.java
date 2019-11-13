public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Veggie Pizza";
        dough = "Veggie Dough";
        sauce = "Veggie Sauce";

        toppings.add("Shredded Mozzarella Veggie");
    }

    void cut(){
        System.out.println("Cutting the pizza into triangle slices");
    }
}
