public class HotDrinkTemp extends HotDrink {
    private int temp;

    public HotDrinkTemp(String name, int vol, int temp) {
        super(name, vol);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }


    public void setTemp(int temp) {
        this.temp = temp;
    }

    
}
