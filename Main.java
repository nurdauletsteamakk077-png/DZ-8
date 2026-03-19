public class Main {
    public static void main(String[] args) {

        Beverage drink = new Espresso();

        drink = new Milk(drink);
        drink = new Sugar(drink);
        drink = new WhippedCream(drink);

        System.out.println("Drink: " + drink.getDescription());
        System.out.println("Total cost: $" + drink.cost());
    }
}
