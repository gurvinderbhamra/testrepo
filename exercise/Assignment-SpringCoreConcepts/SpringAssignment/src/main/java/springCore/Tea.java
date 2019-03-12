package springCore;

public class Tea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing tea";
    }
}
