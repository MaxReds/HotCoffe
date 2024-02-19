public class HotDrinkmachine implements VendingMachine{
    @Override
    public void getProduct() {

    }

    public HotDrinkTemp getProduct(String name, int vol, int temp) {
        return new HotDrinkTemp(name, vol, temp);
    }

    
}

