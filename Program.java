public class Program {
    public static void main(String[] args) {
        HotDrinkTemp hotDrink1 = new HotDrinkTemp("Espresso", 50, 90);
        HotDrinkTemp hotDrink2 = new HotDrinkTemp("Hot chocolate", 150, 85);
        HotDrinkTemp hotDrink3 = new HotDrinkTemp("Tea", 200, 90);

        HotDrinkmachine hdm = new HotDrinkmachine();
        HotDrinkTemp product1 = hdm.getProduct("Espresso", 50, 90);
        HotDrinkTemp product2 = hdm.getProduct("Hot chocolate", 150, 85);
        HotDrinkTemp product3 = hdm.getProduct("Tea", 200, 90);

        

    }

    
}
